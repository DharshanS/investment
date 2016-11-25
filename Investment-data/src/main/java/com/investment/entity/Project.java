package com.investment.entity;

import java.util.Date;

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

@Entity(name = "Project")
@Table(name = "projects")
public class Project implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "projectsSeq", table = "invesmentSeq", initialValue = 0, allocationSize = 1, pkColumnName = "id", pkColumnValue = "projects")
	@GeneratedValue(generator = "projectsSeq", strategy = GenerationType.TABLE)
	private int id;
	private String projectName;
	private String imageUrl;
	private String videoUrl;
	private int amount;
	private CampaignType campigantype;
	private int noOfShares;
	private int singleSharePrice;
	private int minAmmount;
	private Date startdate;
	private Date enddate;
	private int status;
	private User users;
	private Currency currency;
	private CustomerType customertype;
	private Company company;
	private TeamDetail team;
	private InvestSectorMap investSectors;

	public Project() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.ALL)
	// @JoinColumn(name = "caid", nullable = false)
	public CampaignType getCampigantype() {
		return this.campigantype;
	}

	public void setCampigantype(CampaignType campigantype) {
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
	// @JoinColumn(name = "cid", nullable = false)
	public CustomerType getCustomertype() {
		return this.customertype;
	}

	public void setCustomertype(CustomerType customertype) {
		this.customertype = customertype;
	}

	public User getUsers() {
		return this.users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String getprojectName() {
		return this.projectName;
	}

	public void setprojectName(String name) {
		this.projectName = name;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String image) {
		this.imageUrl = image;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String video) {
		this.videoUrl = video;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int value) {
		this.amount = value;
	}

	public int getNoOfShares() {
		return this.noOfShares;
	}

	public void setNoOfShares(int units) {
		this.noOfShares = units;
	}

	public int getSingleSharePrice() {
		return this.singleSharePrice;
	}

	public void setSingleSharePrice(int shareprice) {
		this.singleSharePrice = shareprice;
	}

	public int getMinAmmount() {
		return this.minAmmount;
	}

	public void setMinAmmount(int minimumamount) {
		this.minAmmount = minimumamount;
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
	// @JoinColumn(name = "teamid", nullable = false)
	public TeamDetail getTeamdetailses() {
		return this.team;
	}

	public void setTeamdetailses(TeamDetail teamdetailses) {
		this.team = teamdetailses;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public InvestSectorMap getInvestsectorsmaps() {
		return this.investSectors;
	}

	public void setInvestsectorsmaps(InvestSectorMap investsectorsmaps) {
		this.investSectors = investsectorsmaps;
	}

}
