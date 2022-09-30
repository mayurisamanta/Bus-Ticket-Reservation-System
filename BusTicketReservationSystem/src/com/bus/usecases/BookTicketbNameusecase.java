package com.bus.usecases;

import java.util.Scanner;

import com.bus.bean.Customer;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;
import com.bus.exceptions.BusException;

public class BookTicketbNameusecase {

	public static void BookTicketbName(Customer customer) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bus Name");
		String bName = sc.next();
		
		CustomerDao dao = new CustomerDaoImpl();
		try {
			System.out.println("Enter no. of Tickets to Book");
			int no = sc.nextInt();
			
			int cusId = customer.getCusId();
			String message = dao.bookTicket(bName, cusId, no);
			
			System.out.println(message);
			
		} catch (BusException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
