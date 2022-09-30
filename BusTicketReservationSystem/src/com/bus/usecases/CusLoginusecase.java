package com.bus.usecases;

import java.util.Scanner;

import com.bus.bean.Customer;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;
import com.bus.exceptions.CustomerException;

public class CusLoginusecase {

	public static Customer CusLogin() {
		
		Customer customer = null;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Username");
		String username = sc.next();
		
		System.out.println("Enter Password");
		String password = sc.next();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			 customer = dao.cusLogin(username, password);
			
			System.out.println("Welcome " + customer.getFirstName() + " " + customer.getLastName());
		} catch (CustomerException e) {
			
			System.out.println(e.getMessage());
		}
		
		return customer;
//		sc.close();

	}

}
