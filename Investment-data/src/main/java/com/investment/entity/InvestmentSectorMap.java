package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "InvestmentSectorMap")
@Table(name = "investmentsectorsmap")
public class InvestmentSectorMap implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "investmentsectorsmapSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "investsectorsmap")
	@GeneratedValue(generator = "investmentsectorsmapSeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private InvestmentSector investsectores;
	private Project project;

	public InvestmentSectorMap() {
	}

	public InvestmentSectorMap(int id, InvestmentSector investsectores, Project project) {
		this.id = id;
		this.investsectores = investsectores;
		this.project = project;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public InvestmentSector getInvestsectores() {
		return this.investsectores;
	}

	public void setInvestsectores(InvestmentSector investsectores) {
		this.investsectores = investsectores;
	}

	@OneToOne(fetch = FetchType.LAZY)
	public Project getproject() {
		return this.project;
	}

	public void setproject(Project project) {
		this.project = project;
	}

}





