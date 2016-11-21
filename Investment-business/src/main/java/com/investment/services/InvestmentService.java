package com.investment.services;

import com.investment.json.*;
import com.investment.pojo.Mail;
import com.investment.pojo.Response;



public interface InvestmentService {
	
	
	public UserRegistrationResponse userSignup(UserRegistrationRequest request) throws Exception;
	public UserLoginResponse userSigin(UserLoginRequest request) throws Exception;
	public UserLogoutResponse userSigout(UserLogoutRequest request) throws Exception;
	public Response sendMail(Mail request) throws Exception;


}
