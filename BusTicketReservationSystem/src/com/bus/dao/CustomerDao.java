package com.bus.dao;

import com.bus.bean.Customer;
import com.bus.exceptions.CustomerException;

public interface CustomerDao {

	public String cusSignUp1 (String username, String password, String firstName, String lastName, String address, String mobile) ;
	
	public String cusSignUp2 (Customer customer);
	
	public Customer cusLogin (String username, String password) throws CustomerException;
}
