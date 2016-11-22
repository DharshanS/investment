package com.investment.entity;
// Generated 16-Nov-2016 17:31:17 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

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
@Entity(name = "Investsectores")
@Table(name = "investsectores")
public class Investsectores implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "investsectoresSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "investsectores")
	@GeneratedValue(generator = "investsectoresSeq", strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private Investsectorsmap investsectorsmaps ;

	public Investsectores() {
	}

	public Investsectores(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Investsectores(int id, String name, Investsectorsmap investsectorsmaps) {
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

	public Investsectorsmap getInvestsectorsmaps() {
		return this.investsectorsmaps;
	}

	public void setInvestsectorsmaps(Investsectorsmap investsectorsmaps) {
		this.investsectorsmaps = investsectorsmaps;
	}

}
