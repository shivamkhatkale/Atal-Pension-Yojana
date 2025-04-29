package com.ubi.app.service;

import java.sql.Date;

import com.ubi.app.entity.ApplicationDetails;
import com.ubi.app.entity.OpenApy;
import com.ubi.app.entity.SaveApy;

public interface ApyService {
	
	// Apply APY Journey
	public void ApplyApyJourney(Integer id);
	
	// If age is more than 18 to 40 
	public void ageismorethan(Date id);
	

	public ApplicationDetails saveApplicationDetails(SaveApy s);
	
	public ApplicationDetails openApplicationDetails(OpenApy s);


}
