package com.investment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Dharshan.S
 *
 */
@Entity(name = "Company")
@Table(name = "company")
public class Company implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "companySeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "company")
	@GeneratedValue(generator = "companySeq", strategy = GenerationType.TABLE)
	private int id;
	private Project project;
	private String name;
	private String address;
	private String city;
	private String registerno;
	private Date starteddate;
	private String webdetails;

	public Company() {
	}

	public Company(int id, Project projects, String name, String address, String city, String registerno,
			Date starteddate) {
		this.id = id;
		this.project = projects;
		this.name = name;
		this.address = address;
		this.city = city;
		this.registerno = registerno;
		this.starteddate = starteddate;
	}

	public Company(int id, Project projects, String name, String address, String city, String registerno,
			Date starteddate, String webdetails) {
		this.id = id;
		this.project = projects;
		this.name = name;
		this.address = address;
		this.city = city;
		this.registerno = registerno;
		this.starteddate = starteddate;
		this.webdetails = webdetails;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	public Project getProjects() {
		return this.project;
	}

	public void setProjects(Project projects) {
		this.project = projects;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegisterno() {
		return this.registerno;
	}

	public void setRegisterno(String registerno) {
		this.registerno = registerno;
	}

	public Date getStarteddate() {
		return this.starteddate;
	}

	public void setStarteddate(Date starteddate) {
		this.starteddate = starteddate;
	}

	public String getWebdetails() {
		return this.webdetails;
	}

	public void setWebdetails(String webdetails) {
		this.webdetails = webdetails;
	}

}




