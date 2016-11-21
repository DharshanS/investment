package com.investment.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "projects")
public class Project implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "projectsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "projects")
	@GeneratedValue(generator = "projectsSeq", strategy = GenerationType.TABLE)
	private int id;
	private Campigantype campigantype;
	private Currency currency;
	private Customertype customertype;
	private User users;
	private String name;
	private String image;
	private String video;
	private int value;
	private int type;
	private int units;
	private int uprice;
	private int minimumamount;
	private Date startdate;
	private Date enddate;
	private int status;
	private Company company;
	private Teamdetails teamdetailses;
	private Investsectorsmap investsectorsmaps;
	private Marketdetails marketdetailses;

	public Project() {
	}

	public Project(int id, Campigantype campigantype, Currency currency, Customertype customertype, User users,
			String name, int value, int type, int units, int uprice, int minimumamount, Date startdate, Date enddate,
			int status) {
		this.id = id;
		this.campigantype = campigantype;
		this.currency = currency;
		this.customertype = customertype;
		this.users = users;
		this.name = name;
		this.value = value;
		this.type = type;
		this.units = units;
		this.uprice = uprice;
		this.minimumamount = minimumamount;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
	}

	public Project(int id, Campigantype campigantype, Currency currency, Customertype customertype, User users,
			String name, String image, String video, int value, int type, int units, int uprice, int minimumamount,
			Date startdate, Date enddate, int status, Company company, Teamdetails teamdetailses,
			Investsectorsmap investsectorsmaps, Marketdetails marketdetailses) {
		this.id = id;
		this.campigantype = campigantype;
		this.currency = currency;
		this.customertype = customertype;
		this.users = users;
		this.name = name;
		this.image = image;
		this.video = video;
		this.value = value;
		this.type = type;
		this.units = units;
		this.uprice = uprice;
		this.minimumamount = minimumamount;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
		this.company = company;
		this.teamdetailses = teamdetailses;
		this.investsectorsmaps = investsectorsmaps;
		this.marketdetailses = marketdetailses;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
	@JoinColumn(name = "caid", nullable = false)
	public Campigantype getCampigantype() {
		return this.campigantype;
	}

	public void setCampigantype(Campigantype campigantype) {
		this.campigantype = campigantype;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
	@JoinColumn(name = "currencyid", nullable = false)
	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
	@JoinColumn(name = "cid", nullable = false)
	public Customertype getCustomertype() {
		return this.customertype;
	}

	public void setCustomertype(Customertype customertype) {
		this.customertype = customertype;
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

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getUnits() {
		return this.units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getUprice() {
		return this.uprice;
	}

	public void setUprice(int uprice) {
		this.uprice = uprice;
	}

	public int getMinimumamount() {
		return this.minimumamount;
	}

	public void setMinimumamount(int minimumamount) {
		this.minimumamount = minimumamount;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Company getCompanies() {
		return this.company;
	}

	public void setCompanies(Company company) {
		this.company = company;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	@JoinColumn(name = "tid", nullable = false)
	public Teamdetails getTeamdetailses() {
		return this.teamdetailses;
	}

	public void setTeamdetailses(Teamdetails teamdetailses) {
		this.teamdetailses = teamdetailses;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Investsectorsmap getInvestsectorsmaps() {
		return this.investsectorsmaps;
	}

	public void setInvestsectorsmaps(Investsectorsmap investsectorsmaps) {
		this.investsectorsmaps = investsectorsmaps;
	}

	public Marketdetails getMarketdetailses() {
		return this.marketdetailses;
	}

	public void setMarketdetailses(Marketdetails marketdetailses) {
		this.marketdetailses = marketdetailses;
	}

}
