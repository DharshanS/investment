package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "InvestmentSector")
@Table(name = "investmentsectore")
public class InvestmentSector implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "investmentsectore", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "investsectores")
	@GeneratedValue(generator = "investmentsectore", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	/*private InvestmentSectorMap investsectorsmaps;*/

	public InvestmentSector() {
	}

	public InvestmentSector(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public InvestmentSector(int id, String name, InvestmentSectorMap investsectorsmaps) {
		this.id = id;
		this.name = name;
		/*this.investsectorsmaps = investsectorsmaps;*/
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public InvestmentSectorMap getInvestsectorsmaps() {
		return this.investsectorsmaps;
	}

	public void setInvestsectorsmaps(InvestmentSectorMap investsectorsmaps) {
		this.investsectorsmaps = investsectorsmaps;
	}*/

}


