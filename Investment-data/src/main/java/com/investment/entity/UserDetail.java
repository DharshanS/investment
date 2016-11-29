package com.investment.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Userdetails")
@Table(name = "userdetails")
public class UserDetail implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "userdetailsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "userdetails")
	@GeneratedValue(generator = "userdetailsSeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private User users;
	private String address;
	private BigDecimal mobileno;
	private String description;
	private int userid;

	public UserDetail() {
	}

	public UserDetail(int id, User users, String address, BigDecimal mobileno, String description, int userid) {
		this.id = id;
		this.users = users;
		this.address = address;
		this.mobileno = mobileno;
		this.description = description;
		this.userid = userid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUsers() {
		return this.users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getMobileno() {
		return this.mobileno;
	}

	public void setMobileno(BigDecimal mobileno) {
		this.mobileno = mobileno;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
