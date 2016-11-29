package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Member")
@Table(name = "member")
public class Member implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "memberSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "member")
	@GeneratedValue(generator = "memberSeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Designation designations;
	private TeamDetail teamdetails;
	private String name;
	private int mobile;
	private String address;

	public Member() {
	}

	public Member(int id, Designation designations, TeamDetail teamdetails, String name, int mobile, String address) {
		this.id = id;
		this.designations = designations;
		this.teamdetails = teamdetails;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "did")
	public Designation getDesignations() {
		return this.designations;
	}

	public void setDesignations(Designation designations) {
		this.designations = designations;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public TeamDetail getTeamdetails() {
		return this.teamdetails;
	}

	public void setTeamdetails(TeamDetail teamdetails) {
		this.teamdetails = teamdetails;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return this.mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
