package com.bus.bean;

import java.util.Arrays;

public class Ticket {

	
	private int cusId;
	
	private int busNo;
	
	private int[] seatNo;

	public Ticket(int cusId, int busNo, int[] seatNo) {
		super();
		this.cusId = cusId;
		this.busNo = busNo;
		this.seatNo = seatNo;
	}

	public Ticket() {
		super();
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public int[] getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Ticket [cusId=" + cusId + ", busNo=" + busNo + ", seatNo=" + Arrays.toString(seatNo) + "]";
	}
	
	
}
