package com.bus.bean;

import java.sql.Date;
import java.util.Arrays;

public class CustomerDTO {

	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String mobile;
	
	private int BusNo;
	
	private String bName;
	
	private int[] seatNo;
	
	private String routeFrom;
	
	private String routeTo;
	
	private Date arrival;
	
	private Date departure;

	public CustomerDTO(String firstName, String lastName, String address, String mobile, int busNo, String bName,
			int[] seatNo, String routeFrom, String routeTo, Date arrival, Date departure) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.BusNo = busNo;
		this.bName = bName;
		this.seatNo = seatNo;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.arrival = arrival;
		this.departure = departure;
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

	public int getBusNo() {
		return BusNo;
	}

	public void setBusNo(int busNo) {
		this.BusNo = busNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int[] getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
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

	@Override
	public String toString() {
		return "CustomerDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobile="
				+ mobile + ", BusNo=" + BusNo + ", bName=" + bName + ", seatNo=" + Arrays.toString(seatNo)
				+ ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", arrival=" + arrival + ", departure="
				+ departure + "]";
	}
	
	
	
	

		
}
