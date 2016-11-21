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
@Table(name = "merketdetails")
public class Marketdetails implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "merketdetailsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "merketdetails")
	@GeneratedValue(generator = "merketdetailsSeq", strategy = GenerationType.TABLE)
	private int id;
	private Market market;
	private Marketstratergy marketstratergy;
	private Project project;

	public Marketdetails() {
	}

	public Marketdetails(int id, Market market, Marketstratergy marketstratergy, Project project) {
		this.id = id;
		this.market = market;
		this.marketstratergy = marketstratergy;
		this.project = project;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Marketstratergy getMarketstratergy() {
		return this.marketstratergy;
	}

	public void setMarketstratergy(Marketstratergy marketstratergy) {
		this.marketstratergy = marketstratergy;
	}

	public Project getproject() {
		return this.project;
	}

	public void setproject(Project project) {
		this.project = project;
	}

}
