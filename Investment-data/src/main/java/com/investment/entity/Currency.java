package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "Currency")
@Table(name = "currency")
public class Currency implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "currencySeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "currency")
	@GeneratedValue(generator = "currencySeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String country;
	private String symbol;
	/*private Project project;*/

	public Currency() {
	}

	public Currency(int id, String country, String symbol) {
		this.id = id;
		this.country = country;
		this.symbol = symbol;
	}

	public Currency(int id, String country, String symbol, Project projectses) {
		this.id = id;
		this.country = country;
		this.symbol = symbol;
		/*this.project = projectses;*/
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/*@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_ID")
	public Project getProjectses() {
		return this.project;
	}

	public void setProjectses(Project projectses) {
		this.project = projectses;
	}*/

}
