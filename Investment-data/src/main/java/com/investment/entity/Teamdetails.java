package com.investment.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Dharshan.S
 *
 */
@Entity(name = "Teamdetailsss")
@Table(name = "teamdetails")
public class Teamdetails implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "teamdetailsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "teamdetails")
	@GeneratedValue(generator = "teamdetailsSeq", strategy = GenerationType.TABLE)
	private int id;
	private Project project;
	
	//private List<Member> members = new ArrayList<Member>();

	public Teamdetails() {
	}

	public Teamdetails(int id, Project project) {
		this.id = id;
		this.project = project;
	}

	public Teamdetails(int id, Project project, List<Member> members) {
		this.id = id;
		this.project = project;
		//this.members = members;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
	public Project getproject() {
		return this.project;
	}

	public void setproject(Project project) {
		this.project = project;
	}

//	@OneToMany(fetch=FetchType.LAZY ,mappedBy="teamdetails")
//	public List<Member> getMembers() {
//		return this.members;
//	}
//
//	public void setMembers(List<Member> members) {
//		this.members = members;
//	}

}
