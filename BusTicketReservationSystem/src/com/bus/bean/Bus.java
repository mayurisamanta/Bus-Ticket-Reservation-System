package com.bus.bean;

import java.sql.Date;

public class Bus {

	private int busNo;
	
	private String bName;
	
	private String routeFrom;
	
	private String routeTo;
	
	private String bType;
	
	private Date arrival;
	
	private Date departure;
	
	private int totalSeats;
	
	private int availSeats;

	public Bus(int busNo, String bName, String routeFrom, String routeTo, String bType, Date arrival, Date departure,
			int totalSeats, int availSeats) {
		super();
		this.busNo = busNo;
		this.bName = bName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.bType = bType;
		this.arrival = arrival;
		this.departure = departure;
		this.totalSeats = totalSeats;
		this.availSeats = availSeats;
	}

	public Bus() {
		super();
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
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

	public String getbType() {
		return bType;
	}

	public void setbType(String bType) {
		this.bType = bType;
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

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailSeats() {
		return availSeats;
	}

	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", bName=" + bName + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo
				+ ", bType=" + bType + ", arrival=" + arrival + ", departure=" + departure + ", totalSeats="
				+ totalSeats + ", availSeats=" + availSeats + "]";
	}
	
	
	
	
}
