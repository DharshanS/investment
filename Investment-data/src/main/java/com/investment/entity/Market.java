package com.investment.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Market")
@Table(name = "market")
public class Market implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/*@Id
	@TableGenerator(name = "marketSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "market")
	@GeneratedValue(generator = "marketSeq", strategy = GenerationType.TABLE)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String place;
	// private Set marketdetailses = new HashSet(0);

	public Market() {
	}

	public Market(int id, String place) {
		this.id = id;
		this.place = place;
	}

	public Market(int id, String place, Set marketdetailses) {
		this.id = id;
		this.place = place;
		// this.marketdetailses = marketdetailses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	// public Set getMarketdetailses() {
	// // return this.marketdetailses;
	// }
	//
	// public void setMarketdetailses(Set marketdetailses) {
	// this.marketdetailses = marketdetailses;
	// }

}
