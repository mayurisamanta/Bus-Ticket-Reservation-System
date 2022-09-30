package com.bus.usecases;

import java.util.Scanner;

import com.bus.dao.AdminDao;
import com.bus.dao.AdminDaoImpl;

public class AdminLoginusecase {

	public static boolean AdminLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		AdminDao dao = new AdminDaoImpl();
		String result =  dao.adminLogin(username, password);
		
		System.out.println(result);
		
//		sc.close();
		
		if (result.equals("Login Failed...")) return false;
		else return true;

	}

}
