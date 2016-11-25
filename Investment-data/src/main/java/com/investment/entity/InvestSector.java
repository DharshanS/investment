package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity(name = "Investsectores")
@Table(name = "investsectores")
public class InvestSector implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "investsectoresSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "investsectores")
	@GeneratedValue(generator = "investsectoresSeq", strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private InvestSectorMap investsectorsmaps;

	public InvestSector() {
	}

	public InvestSector(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public InvestSector(int id, String name, InvestSectorMap investsectorsmaps) {
		this.id = id;
		this.name = name;
		this.investsectorsmaps = investsectorsmaps;
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

	public InvestSectorMap getInvestsectorsmaps() {
		return this.investsectorsmaps;
	}

	public void setInvestsectorsmaps(InvestSectorMap investsectorsmaps) {
		this.investsectorsmaps = investsectorsmaps;
	}

}
