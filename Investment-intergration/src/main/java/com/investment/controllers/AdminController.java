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

import com.investment.entity.Project;
import com.investment.entity.User;
import com.investment.json.CreateProjectRequest;
import com.investment.json.CreateProjectResponse;
import com.investment.manager.UserManager;

@RestController
public class AdminController {
	
	@Autowired
	private UserManager userManager;

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

			System.out.println("Inside the admin project creation method");

			Project project = new Project();
			project.setprojectName(createProject.getProjectName());
			System.out.println("project name : " + createProject.getProjectName());

			project.setImageUrl(createProject.getImageUrl());
			System.out.println("Project image url : " + createProject.getImageUrl());

			project.setVideoUrl(createProject.getVideoUrl());
			System.out.println("Project Vidoe Url : " + createProject.getVideoUrl());

			project.setAmount(createProject.getAmount());
			System.out.println("Project Amount : " + createProject.getAmount());

			// project.setCampigantype(createProject.getCampaignType());
			project.setNoOfShares(createProject.getNoOfShares());
			System.out.println("No Of Shares : " + createProject.getNoOfShares());

			project.setSingleSharePrice(createProject.getSingleSharePrice());
			System.out.println("Single Share Price : " + createProject.getSingleSharePrice());

			project.setMinAmmount(createProject.getMinAmmount());
			System.out.println("Minimum Ammount : " + createProject.getMinAmmount());

			project.setStartdate(createProject.getStartDate());
			System.out.println("Start Date : " + createProject.getStartDate());

			project.setEnddate(createProject.getEndDate());
			System.out.println("End Date : " + createProject.getEndDate());

			project.setStatus(createProject.getStatus());
			System.out.println("Project Satatus : " + createProject.getStatus());

			// add the correct user to the project
			List<User> users = new ArrayList<User>();
			users = userManager.getAllRecords();

			for (User ur : users) {
				System.out.println("User Email : " + ur.getEmail());
			}

			// project.setUsers(new User());
			// project.setCurrency(new Currency());
			// project.setCustomertype(createProject.getCustomerTypeId());
			// project.setCompanies();
			// project.setTeamdetailses();
			// project.setInvestsectorsmaps(investsectorsmaps);
		} catch (Exception e) {

		}

		return null;
	}

}
