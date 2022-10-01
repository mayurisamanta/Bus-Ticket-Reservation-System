package com.bus.bean;

public class Ticket {

	private int bId;
	
	private int cusId;
	
	private int busNo;
	
	private int seatFrom;
	
	private int seatTo;
	
	private boolean status;

	public Ticket(int bId, int cusId, int busNo, int seatFrom, int seatTo, boolean status) {
		super();
		this.bId = bId;
		this.cusId = cusId;
		this.busNo = busNo;
		this.seatFrom = seatFrom;
		this.seatTo = seatTo;
		this.status = status;
	}

	public Ticket() {
		super();
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
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
		return "Ticket [bId=" + bId + ", cusId=" + cusId + ", busNo=" + busNo + ", seatFrom=" + seatFrom + ", seatTo="
				+ seatTo + ", status=" + status + "]";
	}
	
	
}
