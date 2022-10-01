package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.bean.Bus;
import com.bus.custom.ConsoleColors;
import com.bus.utility.DButil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String adminLogin(String username, String password) {
		
		String message = "Invalid username or password";
		
		if (username.equals(AdminDao.username) && password.equals(AdminDao.password)) {
			 message = "Login Successfull";
		}
		
		return message;
	}

	@Override
	public String addBus(int busNo, String bName, String routeFrom, String routeTo, String bType, String arrival,
			String departure, int totalSeats, int availSeats, int fare) {
		
		String message = "Bus not Added";
		
		try (Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into bus values (?,?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, busNo);
			ps.setString(2, bName);
			ps.setString(3, routeFrom);
			ps.setString(4, routeTo);
			ps.setString(5, bType);
			ps.setString(6, arrival);
			ps.setString(7, departure);
			ps.setInt(8,totalSeats);
			ps.setInt(9, availSeats);
			ps.setInt(10, fare);
			
			int x = ps.executeUpdate();
			
			if (x > 0) message = "Bus added Successfully";
			
		}
		catch (SQLException e) {
			message  = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String addBus(Bus bus) {
		String message = "Bus not Added";
		
		try (Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into bus values (?,?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, bus.getBusNo());
			ps.setString(2, bus.getbName());
			ps.setString(3, bus.getRouteFrom());
			ps.setString(4, bus.getRouteTo());
			ps.setString(5, bus.getbType());
			ps.setString(6, bus.getArrival());
			ps.setString(7, bus.getDeparture());
			ps.setInt(8,bus.getTotalSeats());
			ps.setInt(9, bus.getAvailSeats());
			ps.setInt(10, bus.getFare());
			
			int x = ps.executeUpdate();
			
			if (x > 0)  message = "Bus added Successfully";
			
		}
		catch (SQLException e) {
			message  = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String updateStatus(int cusId) {
		String message = "Status not update for customer Id : " + cusId;
		
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("update booking set status = true where cusId = ?");
			ps.setInt(1, cusId);
			
			int x = ps.executeUpdate();
			if (x > 0) message = "Status successfully updated for customer Id : " + cusId;
			
		}
		catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public void viewAllTickets() {
		boolean flag = false;
		
		try(Connection conn = DButil.provideConnection()){
			PreparedStatement ps1 = conn.prepareStatement("select * from booking");
			
			ResultSet rs1 = ps1.executeQuery();
			
			while (rs1.next()) {
				flag = true;
				
				System.out.println(ConsoleColors.ROSY_PINK + "----------------------------------------------------" + ConsoleColors.RESET);
				System.out.println(ConsoleColors.ROSY_PINK + "Bus Id : " + rs1.getInt("bId") + ConsoleColors.RESET);
				System.out.println(ConsoleColors.ROSY_PINK + "Bus No : " + rs1.getInt("busNo") + ConsoleColors.RESET);
				System.out.println(ConsoleColors.ROSY_PINK + "Total tickets : " + (rs1.getInt("seatTo") - rs1.getInt("seatFrom") + 1) + ConsoleColors.RESET);
				if (rs1.getInt("status") == 1) System.out.println(ConsoleColors.ROSY_PINK + "Status : Booked" + ConsoleColors.RESET);
				else System.out.println(ConsoleColors.ROSY_PINK + "Status : Pending" + ConsoleColors.RESET);
				
				System.out.println(ConsoleColors.ROSY_PINK + "----------------------------------------------------" + ConsoleColors.RESET);
			}
			
			if (flag == false) System.out.println(ConsoleColors.RED_BACKGROUND + "No tickets found" + ConsoleColors.RESET);
		}
		catch (SQLException s){
			System.out.println(ConsoleColors.RED_BACKGROUND + s.getMessage() + ConsoleColors.RESET);
		}
		
	}

	

}
