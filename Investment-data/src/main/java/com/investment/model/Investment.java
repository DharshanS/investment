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
@Entity(name = "Investment")
@Table(name = "investments")
public class Investment implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "investmentsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "investments")
	@GeneratedValue(generator = "investmentsSeq", strategy = GenerationType.TABLE)
	private int id;
	private Project projects;
	private User users;
	private int amount;
	private int shares;
	private int unitprice;

	public Investment() {
	}

	public Investment(int id, Project projects, User users, int amount, int shares, int unitprice) {
		this.id = id;
		this.projects = projects;
		this.users = users;
		this.amount = amount;
		this.shares = shares;
		this.unitprice = unitprice;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Project getProjects() {
		return this.projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public User getUsers() {
		return this.users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getShares() {
		return this.shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public int getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

}
