package com.investment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "investsectorsmap")
public class Investsectorsmap implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "investsectorsmapSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "investsectorsmap")
	@GeneratedValue(generator = "investsectorsmapSeq", strategy = GenerationType.TABLE)
	private int id;
	private Investsectores investsectores;
	private Project project;

	public Investsectorsmap() {
	}

	public Investsectorsmap(int id, Investsectores investsectores, Project project) {
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

	public Investsectores getInvestsectores() {
		return this.investsectores;
	}

	public void setInvestsectores(Investsectores investsectores) {
		this.investsectores = investsectores;
	}

	public Project getproject() {
		return this.project;
	}

	public void setproject(Project project) {
		this.project = project;
	}

}
