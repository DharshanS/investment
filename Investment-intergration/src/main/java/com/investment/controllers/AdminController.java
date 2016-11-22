package com.investment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.investment.json.CreateProjectRequest;
import com.investment.json.CreateProjectResponse;
import com.investment.model.User;

@RestController
public class AdminController {

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
	public ResponseEntity<CreateProjectResponse> uploadFile(@RequestBody CreateProjectRequest createProject) {
		System.out.println("inside the admin project creation method");
		System.out.println(createProject.getProjectName());
		System.out.println(createProject.getImageUrl());
		System.out.println(createProject.getVideoUrl());
		System.out.println(createProject.getAmount());
		System.out.println(createProject.getCampaignType());
		System.out.println(createProject.getNoOfShares());
		
		return null;
	}

}















