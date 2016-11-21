package com.investment.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "member")
public class Member implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "memberSeq", table = "memberSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "member")
	@GeneratedValue(generator = "memberSeq", strategy = GenerationType.TABLE)
	private int id;
	private Designations designations;
	private Teamdetails teamdetails;
	private String name;
	private int mobile;
	private String address;

	public Member() {
	}

	public Member(int id, Designations designations, Teamdetails teamdetails, String name, int mobile, String address) {
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

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "mapped")
	@JoinColumn(name = "did")
	public Designations getDesignations() {
		return this.designations;
	}

	public void setDesignations(Designations designations) {
		this.designations = designations;
	}

	public Teamdetails getTeamdetails() {
		return this.teamdetails;
	}

	public void setTeamdetails(Teamdetails teamdetails) {
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
