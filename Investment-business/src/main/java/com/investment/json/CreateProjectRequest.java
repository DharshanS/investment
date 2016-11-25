package com.investment.json;

import java.io.Serializable;
import java.util.Date;


public class CreateProjectRequest implements Serializable {

	/**
	 * Author:Masith Prasanga
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String projectName;
	private String imageUrl;
	private String videoUrl;
	private int amount;
	private int campaignType;
	private int noOfShares;
	private int singleSharePrice;
	private int minAmmount;
	private Date startDate;
	private Date endDate;
	private int status;
	private int userId;
	private int currencyId;
	private int customerTypeId;
	private int categoryId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(int campaignType) {
		this.campaignType = campaignType;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public int getSingleSharePrice() {
		return singleSharePrice;
	}
	public void setSingleSharePrice(int singleSharePrice) {
		this.singleSharePrice = singleSharePrice;
	}
	public int getMinAmmount() {
		return minAmmount;
	}
	public void setMinAmmount(int minAmmount) {
		this.minAmmount = minAmmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public int getCustomerTypeId() {
		return customerTypeId;
	}
	public void setCustomerTypeId(int customerTypeId) {
		this.customerTypeId = customerTypeId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CreateProjectRequest [id=" + id + ", projectName=" + projectName + ", imageUrl=" + imageUrl
				+ ", videoUrl=" + videoUrl + ", amount=" + amount + ", campaignType=" + campaignType + ", noOfShares="
				+ noOfShares + ", singleSharePrice=" + singleSharePrice + ", minAmmount=" + minAmmount + ", startDate="
				+ startDate + ", endDate=" + endDate + ", status=" + status + ", userId=" + userId + ", currencyId="
				+ currencyId + ", customerTypeId=" + customerTypeId + ", categoryId=" + categoryId + "]";
	}
}













