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
@Table(name = "customertype")
public class Customertype implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "customertypeSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "customertype")
	@GeneratedValue(generator = "customertypeSeq", strategy = GenerationType.TABLE)
	private int id;
	private String type;
	private Project project;

	public Customertype() {
	}

	public Customertype(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public Customertype(int id, String type, Project project) {
		this.id = id;
		this.type = type;
		this.project = project;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Project getProjectses() {
		return this.project;
	}

	public void setProjectses(Project projectses) {
		this.project = projectses;
	}

}
