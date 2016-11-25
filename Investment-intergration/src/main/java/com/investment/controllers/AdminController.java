package com.investment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.investment.entity.Company;
import com.investment.entity.Project;
import com.investment.entity.TeamDetail;
import com.investment.entity.User;
import com.investment.json.CreateProjectRequest;
import com.investment.json.CreateProjectResponse;
import com.investment.manager.CampaignTypeManager;
import com.investment.manager.CompanyManger;
import com.investment.manager.CurrencyManager;
import com.investment.manager.CustomerTypeManager;
import com.investment.manager.InvestmentSectorMapManager;
import com.investment.manager.UserManager;

@RestController
public class AdminController {

	@Autowired
	private UserManager userManager = null;

	@Autowired
	private CurrencyManager currencyManager = null;

	@Autowired
	private CustomerTypeManager customertypeManager = null;
	
	@Autowired
	private CompanyManger companyManager = null;
	
	@Autowired
	private CampaignTypeManager campaignTypeManager = null;
	
	@Autowired
	private InvestmentSectorMapManager investSectorMapManager = null;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		System.out.println("Inside the Admin Controller getAllUsers Method");
		List<User> users = new ArrayList<User>();
		for (int i = 1; i <= 10; i++) {
			users.add(new User(i, "Masith" + i, "masithprasanga@gmail.com"));
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/createproject", method = RequestMethod.POST)
	public ResponseEntity<CreateProjectResponse> createProject(@RequestBody CreateProjectRequest createProject)
			throws Exception {
		try {

			// filling the Project Details
			Project project = new Project();						
			project.setprojectName(createProject.getProjectName());
			project.setImageUrl(createProject.getImageUrl());
			project.setVideoUrl(createProject.getVideoUrl());
			project.setAmount(createProject.getAmount());
			project.setCampigantype(campaignTypeManager.findById(createProject.getCampaignType()));
			project.setNoOfShares(createProject.getNoOfShares());
			project.setSingleSharePrice(createProject.getSingleSharePrice());
			project.setMinAmmount(createProject.getMinAmmount());
			project.setStartdate(createProject.getStartDate());
			project.setEnddate(createProject.getEndDate());
			project.setStatus(createProject.getStatus());
			project.setUsers(userManager.findById(createProject.getUserId()));
			project.setCurrency(currencyManager.findById(createProject.getCurrencyId()));
			project.setCustomertype(customertypeManager.findById(createProject.getCustomerTypeId()));
			
			// filling the company details
			Company newCompany = new Company();
			
			
			// filling the team details
			TeamDetail teamDetails = new TeamDetail();
			
			// filling investsector details
			
			System.out.println("End of Create Project");
			
		} catch (Exception e) {
			System.out.println("Admin Controller Exception :  " + e);
		}

		return null;
	}

}








