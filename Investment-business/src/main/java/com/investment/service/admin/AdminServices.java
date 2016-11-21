package com.investment.service.admin;

import com.investment.json.CreateProjectRequest;
import com.investment.json.CreateProjectResponse;
import com.investment.json.EntrepreneurRequest;
import com.investment.json.EntrepreneurResponse;
import com.investment.json.InvestorsRequest;
import com.investment.json.InvestorsResponse;


public interface AdminServices {
	
	public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception;
	public InvestorsResponse viewInvestors(InvestorsRequest request) throws Exception;
	public EntrepreneurResponse viewEntrepreneur(EntrepreneurRequest request) throws Exception;

}
