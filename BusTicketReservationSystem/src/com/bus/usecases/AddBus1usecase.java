package com.bus.usecases;

import java.util.Scanner;

import com.bus.dao.AdminDao;
import com.bus.dao.AdminDaoImpl;

public class AddBus1usecase {

	public static void AddBus() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bus number");
		int busNo = sc.nextInt();
		
		System.out.println("Enter bus name");
		String bName = sc.next();
		
		System.out.println("Enter Route from");
		String routeFrom = sc.next();
		
		System.out.println("Enter Routo To");
		String routeTo = sc.next();
		
		System.out.println("Enter Bus Type - AC / NonAC");
		String bType = sc.next();
		
		System.out.println("Enter Arrival date");
		String arrival = sc.next();
		
		System.out.println("Enter departure date");
		String departure = sc.next();
		
		System.out.println("Enter Total Seats");
		int totalSeats = sc.nextInt();
		
		System.out.println("Enter Available Seats");
		int availSeats = sc.nextInt();
		
		System.out.println("Enter fare");
		int fare = sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		
		String result = dao.addBus(busNo, bName, routeFrom, routeTo, bType, arrival, departure, totalSeats, availSeats, fare);
		
		System.out.println(result);
		
//		sc.close();
	}

}
