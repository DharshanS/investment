
package com.investment.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Dharshan.S
 *
 */
@Entity(name = "User")
@Table(name = "users")
public class User implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	@TableGenerator(name = "usersSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "users")
	@GeneratedValue(generator = "usersSeq", strategy = GenerationType.TABLE)
	private int id;
	private String firstname;
	private String email;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Role.class)
	private List<Role> roles = new ArrayList<Role>();

	public User() {
	}

	public User(int id, String firstname, String email) {
		this.id = id;
		this.firstname = firstname;
		this.email = email;
	}

	public User(int id, String firstname, String email, List<Role> roleses) {
		this.id = id;
		this.firstname = firstname;
		this.email = email;
		this.roles = roleses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoleses() {
		return this.roles;
	}

	public void setRoleses(List<Role> roleses) {
		this.roles = roleses;
	}

}
