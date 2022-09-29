package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.bean.Customer;
import com.bus.exceptions.CustomerException;
import com.bus.utility.DButil;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String cusSignUp1(String username, String password, String firstName, String lastName, String address,
			String mobile) {
		
		String message = "Sign up Failed...";
		
		try(Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("insert into customer(username, password, firstName, lastName, address, mobile) values (?,?,?,?,?,?)");
			
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3,  firstName);
			ps.setString(4,  lastName);
			ps.setString(5,  address);
			ps.setString(6,  mobile);
			
			int x = ps.executeUpdate();
			
			if (x > 0) message = "Sign up Successfull...";
			
		}
		catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String cusSignUp2(Customer customer) {
		
		String message = "Sign up Failed...";
		
		try(Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("insert into customer(username, password, firstName, lastName, address, mobile) values (?,?,?,?,?,?)");
			
			ps.setString(1, customer.getUsername());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getAddress());
			ps.setString(6, customer.getMobile());
			
			int x = ps.executeUpdate();
			
			if (x > 0) message = "Sign up Successfull...";
			
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
				
				String usernamee =  rs.getString("username");
				
				String passwordd = rs.getString("password");
				
				String firstName = rs.getString("firstName");
				
				String lastName = rs.getString("lastName");
				
				String address = rs.getString("address");
				
				String mobile = rs.getString("mobile");
				
				customer = new Customer(usernamee, passwordd, firstName, lastName, address, mobile);
				
			}
			else {
				throw new CustomerException("Customer with username : " + username + " is not available...");
				
			}
			
		}
		catch (SQLException e) {
			throw new CustomerException(e.getMessage());
		}
		
		return customer;
	}

	
}
