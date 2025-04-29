package com.ubi.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubi.app.entity.ApplyAPY;
import com.ubi.app.service.ApyService;

@RestController
@RequestMapping("/app/v1/api")
public class ApyController {

	@Autowired
	private ApyService service;

	@PostMapping("/Apply-Now")
	public ResponseEntity<ApplyAPY> applicationDetails(@RequestBody ApplyAPY aa) {

		service.ApplyApyJourney(aa.getAId());
		service.ageismorethan(aa.getDob());
		
		
		
		
		
		
		return null;

	}

}
