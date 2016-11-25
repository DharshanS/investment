package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity(name = "Analytics")
@Table(name = "analytics")
public class Analytics implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "analyticsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "analytics")
	@GeneratedValue(generator = "analyticsSeq", strategy = GenerationType.TABLE)
	private int id;
	private Project projects;
	private User users;
	private int view;
	private int invest;

	public Analytics() {
	}

	public Analytics(Project projects, User users, int view, int invest) {
		this.projects = projects;
		this.users = users;
		this.view = view;
		this.invest = invest;
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

	@ManyToOne
	@JoinColumn(name = "uid", nullable = false)
	public User getUsers() {
		return this.users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public int getView() {
		return this.view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public int getInvest() {
		return this.invest;
	}

	public void setInvest(int invest) {
		this.invest = invest;
	}

}
