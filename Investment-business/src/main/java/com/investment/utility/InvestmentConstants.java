package com.investment.utility;

public enum InvestmentConstants {
	
	SUCCESS("SUCCESS",1),
	FAILIER("FAILIER",0),
	AOUTHER("AOUTHER",2),
	ADMIN("ADMIN",10),
	ENTREPRENER("ENTREPRENER",11),
	INVESTOR("INVESTOR",12);
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	private String status;
	private int code;
	private InvestmentConstants(String status, int code) {
		this.status = status;
		this.code = code;
	}

}
