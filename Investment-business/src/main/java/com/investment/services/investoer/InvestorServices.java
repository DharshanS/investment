package com.investment.services.investoer;

import com.investment.json.SubscriptionRequest;
import com.investment.json.SubscriptionResponse;
import com.investment.json.ViewProjectRequest;
import com.investment.json.ViewProjectResponse;

public interface InvestorServices {
	
	public ViewProjectResponse viewProjects(ViewProjectRequest request) throws Exception;
	public SubscriptionResponse subscribe(SubscriptionRequest request) throws Exception;

}
