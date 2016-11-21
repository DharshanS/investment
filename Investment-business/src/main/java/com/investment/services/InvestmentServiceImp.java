package com.investment.services;





import org.springframework.stereotype.Service;

import com.investment.json.UserLoginRequest;
import com.investment.json.UserLoginResponse;
import com.investment.json.UserLogoutRequest;
import com.investment.json.UserLogoutResponse;
import com.investment.json.UserRegistrationRequest;
import com.investment.json.UserRegistrationResponse;
import com.investment.pojo.Mail;
import com.investment.pojo.Response;


@Service("investmentServiceImp")
public  class InvestmentServiceImp implements InvestmentService{

	public UserRegistrationResponse userSignup(UserRegistrationRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLoginResponse userSigin(UserLoginRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLogoutResponse userSigout(UserLogoutRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Response sendMail(Mail request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Autowired
	@Qualifier("investmentBaseDaoImp")
	private InvestmentBaseDao investmentBaseDao;*/
	
	
	

}
