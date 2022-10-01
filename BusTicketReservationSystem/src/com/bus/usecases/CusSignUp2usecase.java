package com.bus.usecases;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bus.bean.Customer;
import com.bus.custom.ConsoleColors;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;

public class CusSignUp2usecase {

	public static boolean cusSignUp() {
		
		boolean flag = false;
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(ConsoleColors.ORANGE + "Enter Username" + ConsoleColors.RESET);
			String username = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Password" + ConsoleColors.RESET);
			String password = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter First Name" + ConsoleColors.RESET);
			String firstName = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Last Name" + ConsoleColors.RESET);
			String lastName = sc.next();
			
			sc.nextLine();
			System.out.println(ConsoleColors.ORANGE + "Enter Address" + ConsoleColors.RESET);
			String address = sc.nextLine();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Mobile" + ConsoleColors.RESET);
			String mobile = sc.next();
			
			CustomerDao dao = new CustomerDaoImpl();
			Customer customer = new Customer(username, password, firstName, lastName, address, mobile);
			
			String result = dao.cusSignUp(customer);
			
			
			if (result == "Sign up Successfull") {
				flag = true;
				System.out.println(ConsoleColors.GREEN_BACKGROUND + result + ConsoleColors.RESET);
			}
			else {
				System.out.println(ConsoleColors.RED_BACKGROUND + result + ConsoleColors.RESET);
			}
			
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + "Invalid Input" + ConsoleColors.RESET);
		}
		
		return flag;
	}

}
