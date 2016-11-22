package com.investment.entity;

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
@Entity(name = "CampaignType")
@Table(name = "campaigntype")
public class CampaignType implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "campaigntypeSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "campaigntype")
	@GeneratedValue(generator = "campaigntypeSeq", strategy = GenerationType.TABLE)
	private int id;
	private String type;
	private Project project;

	public CampaignType() {
	}

	public CampaignType(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public CampaignType(int id, String type, Project projectses) {
		this.id = id;
		this.type = type;
		this.project = projectses;
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

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
	public Project getProjectses() {
		return this.project;
	}

	public void setProjectses(Project project) {
		this.project = project;
	}

}













