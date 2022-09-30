package com.bus.usecases;

import java.util.Scanner;

import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class CusSignUp1usecase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username = sc.next();
		
		System.out.println("Enter Password");
		String password = sc.next();
		
		System.out.println("Enter First Name");
		String firstName = sc.next();
		
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		
		System.out.println("Enter Address");
		String address = sc.next();
		
		System.out.println("Enter Mobile");
		String mobile = sc.next();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		String result = dao.cusSignUp(username, password, firstName, lastName, address, mobile);
		
		System.out.println(result);
		
//		sc.close();

	}

}
