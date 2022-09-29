package com.bus.dao;

public interface AdminDao {
	
	public final String username = "Admin";
	
	public final String password = "1234";

	public String adminLogin(String username, String password);
}
