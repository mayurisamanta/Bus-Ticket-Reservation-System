package com.bus.bean;

public class Customer {

	private int cusId;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String mobile;

	public Customer(int cusId, String firstName, String lastName, String address, String mobile) {
		super();
		this.cusId = cusId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
	}

	public Customer() {
		super();
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
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

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", mobile=" + mobile + "]";
	}
	
	
}
