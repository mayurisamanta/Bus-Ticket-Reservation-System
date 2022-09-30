package com.bus.main;

import java.util.Scanner;

import com.bus.bean.Customer;
import com.bus.usecases.AddBus1usecase;
import com.bus.usecases.AdminLoginusecase;
import com.bus.usecases.BookTicketbNameusecase;
import com.bus.usecases.CancelTicketbNameusecase;
import com.bus.usecases.CusLoginusecase;
import com.bus.usecases.CusSignUp1usecase;
import com.bus.usecases.CusSignUp2usecase;

public class Main {

	public static void main(String[] args) {
		
//		CusSignUp1usecase.main(args);
//		CusSignUp2usecase.main(args);
//		CusLoginusecase.main(args);
//		AdminLoginusecase.main(args);
//		AddBususecase.main(args);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Login As Administrator" + "\n"
				+ "2. Login As Customer");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			
			System.out.println("Welcome !" + "\n"
					+ "Please Login to your account" );
			Boolean result = AdminLoginusecase.AdminLogin();
			
			if (result == false) Main.main(args);
			else {
				
				while (true) {
					adminMethods();
					
					int adminChoice = sc.nextInt();
					
					switch(adminChoice) {
						case 1 : AddBus1usecase.AddBus();
						break;
						case 2 : 
						break;
						case 3 :
						break;
						case 4 : System.exit(0);
					}
				}
				
			}
	
		}
		else if (choice == 2) {
			System.out.println("1. Login to your Account" + "\n"
					+ "2. Don't have Account? Sign up");
			
			int customerchoice1 = sc.nextInt();
			if (customerchoice1 == 1) {
				Customer customer = CusLoginusecase.CusLogin();
				
				if (customer == null) Main.main(args);
				else {
					
					while (true) {
						
						customerMethods();
						
						int customerchoice2 = sc.nextInt();
						
						switch (customerchoice2) {
							case 1 : BookTicketbNameusecase.BookTicketbName(customer);
							break;
							case 2 : CancelTicketbNameusecase.cancelTicket(customer);
							break;
							case 3 :
							break;	
							case 4 : System.exit(0);
								
						}
					}
					
				}
			}
			else if (customerchoice1 == 2) {
				
			}
		}
	}
	
	static void adminMethods() {
		System.out.println("1. Add Bus" + "\n"
				+ "2. Confirm Tickets of Customer" + "\n"
				+ "3. View All Bookings" + "\n"
				+ "4. Exit");
		
	}
	
	static void customerMethods() {
		System.out.println("1. Book Bus Ticket" + "\n"
				+ "2. Cancel Bus Ticket" + "\n"
				+ "3. View Status of your Tickets" + "\n"
				+ "4. Exit");
		
	}

}
