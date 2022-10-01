package com.bus.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.bean.Customer;
import com.bus.custom.ConsoleColors;
import com.bus.exceptions.BusException;
import com.bus.exceptions.CustomerException;
import com.bus.utility.DButil;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String cusSignUp(String username, String password, String firstName, String lastName, String address,
			String mobile) {
		
		String message = "Sign up Failed";
		
		try(Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("insert into customer(username, password, firstName, lastName, address, mobile) values (?,?,?,?,?,?)");
			
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3,  firstName);
			ps.setString(4,  lastName);
			ps.setString(5,  address);
			ps.setString(6,  mobile);
			
			int x = ps.executeUpdate();
			
			if (x > 0) message = "Sign up Successfull";
			
		}
		catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String cusSignUp(Customer customer) {
		
		String message = "Sign up Failed";
		
		try(Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("insert into customer(username, password, firstName, lastName, address, mobile) values (?,?,?,?,?,?)");
			
			ps.setString(1, customer.getUsername());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getAddress());
			ps.setString(6, customer.getMobile());
			
			int x = ps.executeUpdate();
			
			if (x > 0) message = "Sign up Successfull";
			
		}
		catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
		
	}

	@Override
	public Customer cusLogin(String username, String password) throws CustomerException {
		
		Customer customer = null;
		
		try (Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where username = ? and password = ?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs =  ps.executeQuery();
			
			if (rs.next()) {
				int cusId = rs.getInt("cusId");
				String usernamee =  rs.getString("username");
				String passwordd = rs.getString("password");
				String firstName = rs.getString("firstName");		
				String lastName = rs.getString("lastName");			
				String address = rs.getString("address");			
				String mobile = rs.getString("mobile");
				
				customer = new Customer(cusId,usernamee, passwordd, firstName, lastName, address, mobile);
				
			}
			else {
				throw new CustomerException("Invalid username or password");
				
			}
			
		}
		catch (SQLException e) {
			throw new CustomerException(e.getMessage());
		}
		
		return customer;
	}

	@Override
	public String bookTicket(String bName, int cusId, int no) throws BusException {
	
		String message = "Ticket Booking fail";
		
		try (Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from bus where bName = ?");
			ps.setString(1, bName);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				
				int busNo = rs.getInt("busNo");
				int totalSeats = rs.getInt("totalSeats");
				int availSeats = rs.getInt("availSeats");
				Date departure = rs.getDate("departure");
				int fare = rs.getInt("fare");
				
				PreparedStatement ps1 = conn.prepareStatement("select datediff(?,current_date()) as date");
				ps1.setDate(1, departure);
				
				ResultSet rs1 = ps1.executeQuery();
				int days = 0;
				if (rs1.next()) {
					days = rs1.getInt("date");
				}
				
				if (days <= 0) {
					throw new BusException("Booking is not available for this date");
				}
				else if (availSeats >= no) {
					int seatFrom = totalSeats - availSeats + 1;
					int seatTo = seatFrom + no -1;
					fare = fare * no;
					
					PreparedStatement ps2 = conn.prepareStatement("insert into booking(cusId, busNo, seatFrom, seatTo) values (?, ?, ?, ?)");
					ps2.setInt(1, cusId);
					ps2.setInt(2, busNo);
					ps2.setInt(3, seatFrom);
					ps2.setInt(4, seatTo);
					
					int x = ps2.executeUpdate();

					if (x > 0) {
						
						PreparedStatement ps3 = conn.prepareStatement("update bus set availseats = ? where busNo = ?");
						availSeats = availSeats - no;
						ps3.setInt(1, availSeats);
						ps3.setInt(2, busNo);
						int y = ps3.executeUpdate();
						
						if (y <= 0) throw new BusException("Available Seat is not updated");
						
						
						System.out.println(ConsoleColors.ROSY_PINK + "--------------------------------------------" + "\n"
																   + "Customer Id is : " + cusId + "\n"
																   + "Bus No is : " + busNo + "\n"
																   + "Seat No is from : " + seatFrom + " to " + seatTo + "\n"
																   + "Bus fare is : " + fare + "\n"
																   + "Booking yet to be confirm by Adminstrator" + "\n" 
																   + "---------------------------------------------" + ConsoleColors.RESET);
						
						 message = "Ticket Booked Successfully";
					}
				
				}
	
			}
			else {
				throw new BusException("Bus with " + bName + " is not available");
			}
			
		}
		catch (SQLException e) {
			throw new BusException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String cancelTicket(String bName, int cusId) throws BusException {
		String message = "Ticket cancellation failed";
		
		try (Connection conn = DButil.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("select * from bus where bName = ?");
				ps.setString(1, bName);
				
				ResultSet rs = ps.executeQuery();
				
				if (rs.next()) {
					
					int busNo = rs.getInt("busNo");
					int availSeats = rs.getInt("availSeats");
					
					PreparedStatement ps1 = conn.prepareStatement("select * from booking where busNo = ? and cusId = ?");
					ps1.setInt(1, busNo);
					ps1.setInt(2, cusId);
					
					ResultSet rs1 = ps1.executeQuery();
					boolean flag = false;
					int count = 0;
					
					while (rs1.next()) {
						flag = true;
						int seatFrom = rs1.getInt("seatFrom");
						int seatTo = rs1.getInt("seatTo");
						count += seatTo - seatFrom + 1;
					}
					
				    if (flag) {
						
						PreparedStatement ps2 = conn.prepareStatement("delete from booking where busNo = ? and cusId = ?");
						ps2.setInt(1, busNo);
						ps2.setInt(2, cusId);
						
						int x = ps2.executeUpdate();
						if (x > 0) {
							
							PreparedStatement ps3 = conn.prepareStatement("update bus set availseats = ? where busNo = ?");
							availSeats = availSeats + count;
							ps3.setInt(1, availSeats);
							ps3.setInt(2, busNo);
							int y = ps3.executeUpdate();
							
							if (y <= 0) throw new BusException("Available Seat is not updated");
							
							 message = "Ticket cancelled Successfully";
						}
					
					}
				    else message = "No booking found";
		
				}
				else {
					throw new BusException("Bus with " + bName + " is not available");
				}
				
			}
			catch (SQLException e) {
				throw new BusException(e.getMessage());
			}
		
		return message;
	
	}

	@Override
	public void viewTicket(int cusId) {
		boolean flag = false;
		
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps1 = conn.prepareStatement("select * from booking where cusId = ?");
			ps1.setInt(1, cusId);
			
			ResultSet rs1 = ps1.executeQuery();
			
			while (rs1.next()) {
				flag = true;
				System.out.println(ConsoleColors.ROSY_PINK + "---------------------------------------------" + ConsoleColors.RESET);
				System.out.println(ConsoleColors.ROSY_PINK + "Bus Id : " + rs1.getInt("bId") + ConsoleColors.RESET);
				System.out.println(ConsoleColors.ROSY_PINK + "Bus No : " + rs1.getInt("busNo") + ConsoleColors.RESET);
				System.out.println(ConsoleColors.ROSY_PINK + "Total tickets : " + (rs1.getByte("seatTo") - rs1.getInt("seatFrom") + 1) + ConsoleColors.RESET);
				if (rs1.getBoolean("status")) System.out.println(ConsoleColors.ROSY_PINK + "Status : Booked"  + ConsoleColors.RESET);
				else System.out.println(ConsoleColors.ROSY_PINK + "Status : Pending" + ConsoleColors.RESET);
				
				System.out.println(ConsoleColors.ROSY_PINK + "----------------------------------------------" + ConsoleColors.RESET);
			}
			
			if (flag == false) System.out.println(ConsoleColors.RED_BACKGROUND + "No tickets found" + ConsoleColors.RESET);
		}
		catch (SQLException s){
			System.out.println(ConsoleColors.RED_BACKGROUND + s.getMessage() + ConsoleColors.RESET);
		}
		
	}

	

	
}
