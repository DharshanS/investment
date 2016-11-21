package com.investment.services.entrepreneur;

import org.springframework.stereotype.Service;

import com.investment.json.ProjectUploadRequest;
import com.investment.services.InvestmentServiceImp;
@Service("entrepreneurServices")
public class EntrepreneurServicesImp extends InvestmentServiceImp implements EntrepreneurServices{

	public boolean uploadProject(ProjectUploadRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

}
