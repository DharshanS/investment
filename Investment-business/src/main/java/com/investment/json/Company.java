package com.investment.json;

import java.util.Date;

public class Company {

	private String name;
	private String address;
	private String city;
	private String registerno;
	private Date starteddate;
	private String webdetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegisterno() {
		return registerno;
	}
	public void setRegisterno(String registerno) {
		this.registerno = registerno;
	}
	public Date getStarteddate() {
		return starteddate;
	}
	public void setStarteddate(Date starteddate) {
		this.starteddate = starteddate;
	}
	public String getWebdetails() {
		return webdetails;
	}
	public void setWebdetails(String webdetails) {
		this.webdetails = webdetails;
	}
	
}


