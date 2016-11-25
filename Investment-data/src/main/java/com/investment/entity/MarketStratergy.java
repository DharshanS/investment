package com.investment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity(name = "Marketstratergy")
@Table(name = "marketstratergy")
public class MarketStratergy implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "marketstratergySeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "marketstratergy")
	@GeneratedValue(generator = "marketstratergySeq", strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private MarketDetails marketdetailses;

	public MarketStratergy() {
	}

	public MarketStratergy(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public MarketStratergy(int id, String name, MarketDetails marketdetailses) {
		this.id = id;
		this.name = name;
		this.marketdetailses = marketdetailses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarketDetails getMarketdetailses() {
		return this.marketdetailses;
	}

	public void setMarketdetailses(MarketDetails marketdetailses) {
		this.marketdetailses = marketdetailses;
	}

}
