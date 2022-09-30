package com.bus.bean;

public class CustomerDTO {
	
	private int BId;

	private String firstName;
	
	private String lastName;
	
	private String mobile;
	
	private int busNo;
	 
	 private String bName;
	 
	 private String routeFrom;
	 
	 private String routeTo;
	 
	 private String arrival;
	 
	 private String departure;
	 
	 private int fare;
	 
	 private int seatFrom;
	 
	 private int seatTo;
	 
	 private boolean status;

	public CustomerDTO(int bId, String firstName, String lastName, String mobile, int busNo, String bName,
			String routeFrom, String routeTo, String arrival, String departure, int fare, int seatFrom, int seatTo,
			boolean status) {
		super();
		BId = bId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.busNo = busNo;
		this.bName = bName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.arrival = arrival;
		this.departure = departure;
		this.fare = fare;
		this.seatFrom = seatFrom;
		this.seatTo = seatTo;
		this.status = status;
	}

	public CustomerDTO() {
		super();
	}

	public int getBId() {
		return BId;
	}

	public void setBId(int bId) {
		BId = bId;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getSeatFrom() {
		return seatFrom;
	}

	public void setSeatFrom(int seatFrom) {
		this.seatFrom = seatFrom;
	}

	public int getSeatTo() {
		return seatTo;
	}

	public void setSeatTo(int seatTo) {
		this.seatTo = seatTo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerDTO [BId=" + BId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", busNo=" + busNo + ", bName=" + bName + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo
				+ ", arrival=" + arrival + ", departure=" + departure + ", fare=" + fare + ", seatFrom=" + seatFrom
				+ ", seatTo=" + seatTo + ", status=" + status + "]";
	}
	 
	 
	 

}
