package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Userproject")
@Table(name = "userproject")
public class UserProject implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "userprojectSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "userproject")
	@GeneratedValue(generator = "userprojectSeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private User users;
	private String name;
	private String file;
	private int status;

	public UserProject() {
	}

	public UserProject(int id, User users, String name, String file, int status) {
		this.id = id;
		this.users = users;
		this.name = name;
		this.file = file;
		this.status = status;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUsers() {
		return this.users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
