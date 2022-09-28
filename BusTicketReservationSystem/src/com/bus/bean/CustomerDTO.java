package com.bus.bean;

import java.sql.Date;
import java.util.Arrays;

public class CustomerDTO {

	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String mobile;
	
	private String bName;
	
	private String routeFrom;
	
	private String routeTo;
	
	private Date arrival;
	
	private Date departure;
	
	private int[] seatNo;

	public CustomerDTO(String firstName, String lastName, String address, String mobile, String bName, String routeFrom,
			String routeTo, Date arrival, Date departure, int[] seatNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.bName = bName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.arrival = arrival;
		this.departure = departure;
		this.seatNo = seatNo;
	}

	public CustomerDTO() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getRouteFrom() {
		return routeFrom;
	}

	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public int[] getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "CustomerDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobile="
				+ mobile + ", bName=" + bName + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", arrival="
				+ arrival + ", departure=" + departure + ", seatNo=" + Arrays.toString(seatNo) + "]";
	}
	
	
}
