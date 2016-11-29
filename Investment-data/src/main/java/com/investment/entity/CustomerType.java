package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "Customertype")
@Table(name = "customertype")
public class CustomerType implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "customertypeSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "customertype")
	@GeneratedValue(generator = "customertypeSeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;
	/*private Project project;*/

	public CustomerType() {
	}

	public CustomerType(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public CustomerType(int id, String type, Project project) {
		this.id = id;
		this.type = type;
		/*this.project = project;*/
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	public Project getProjects() {
		return this.project;
	}

	public void setProjects(Project project) {
		this.project = project;
	}*/

}
