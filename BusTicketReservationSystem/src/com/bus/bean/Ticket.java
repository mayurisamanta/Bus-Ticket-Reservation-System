package com.bus.bean;

import java.util.Arrays;

public class Ticket {

	
	private int cusId;
	
	private int busId;
	
	private int[] seatNo;

	public Ticket(int cusId, int busId, int[] seatNo) {
		super();
		this.cusId = cusId;
		this.busId = busId;
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

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int[] getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Ticket [cusId=" + cusId + ", busId=" + busId + ", seatNo=" + Arrays.toString(seatNo) + "]";
	}
	
	
}
