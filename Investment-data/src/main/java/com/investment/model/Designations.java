package com.investment.model;

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
@Entity
@Table(name = "designations")
public class Designations implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "designationsSeq", table = "designationsSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "designations")
	@GeneratedValue(generator = "designationsSeq", strategy = GenerationType.TABLE)
	private int id;
	private int name;
	private Member members;

	public Designations() {
	}

	public Designations(int id, int name) {
		this.id = id;
		this.name = name;
	}

	public Designations(int id, int name, Member members) {
		this.id = id;
		this.name = name;
		this.members = members;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Member getMembers() {
		return this.members;
	}

	public void setMembers(Member members) {
		this.members = members;
	}

}
