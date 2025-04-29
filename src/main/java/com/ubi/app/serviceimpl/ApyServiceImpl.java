package com.ubi.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ubi.app.entity.ApplicationDetails;
import com.ubi.app.entity.SaveApy;
import com.ubi.app.exception.IncomeTaxValidationException;
import com.ubi.app.repo.ApplyApy;
import com.ubi.app.repo.ApyAccountRepo;
import com.ubi.app.service.ApyService;

public class ApyServiceImpl implements ApyService {

	@Autowired
	private ApyAccountRepo repo;
	
	@Autowired 
	private ApplyApyRepo repoapy;

	@Override
	public ApplicationDetails saveApplicationDetails(SaveApy s) {

		boolean a = s.getIncomeTax().equals("Y");

		if (a) {
			throw new IncomeTaxValidationException("Income Tax Payer Not Allowed");
		}

		return null;
	}

	@Override
	public void ApplyApyJourney(String accountOpen) {
		repo.findByaccountOpen(accountopen)).orElseThrow(() -> new ApyAccountAlreadyExists("APY Account is already exists"));
		
		
		
	}

	

}
