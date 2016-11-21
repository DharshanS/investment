package com.investment.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.investment.json.UserLoginRequest;
import com.investment.json.UserRegistrationRequest;
import com.investment.json.UserRegistrationResponse;
import com.investment.services.InvestmentService;




@RestController
public class UserController {
	
	
	@Autowired
	@Qualifier("investmentServiceImp")
	private InvestmentService investmentServices;
	
	
	@PostMapping(value = "/signup")
	public @ResponseBody UserRegistrationResponse userRegistration(@RequestBody UserRegistrationRequest request )
	{
		UserRegistrationResponse response = new UserRegistrationResponse();
		try {
		System.out.println("UserRegistrationRequest :"+request.getEmail());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
		
	}
	
	@PostMapping(value = "/signin")
	public @ResponseBody UserRegistrationResponse userSigin(@RequestBody UserLoginRequest request )
	{
		UserRegistrationResponse response = new UserRegistrationResponse();
		try {
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
		
	}

}
