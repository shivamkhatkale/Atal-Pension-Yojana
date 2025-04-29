package com.ubi.app.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ubi.app.entity.ApyError;
import com.ubi.app.exception.ApyAccountAlreadyExists;
import com.ubi.app.exception.IncomeTaxValidationException;


@RestControllerAdvice
public class CustomException {

	@ExceptionHandler(IncomeTaxValidationException.class)
	public ResponseEntity<ApyError> IncomeTaxValidationException(IncomeTaxValidationException itve){
		
		return new ResponseEntity<>(new ApyError("You are not eligible to apply for Atal Pension Yojana",
				"As per regulations, Income tax payers are not eligible to apply for Atal Pension Yojana"),
				HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(ApyAccountAlreadyExists.class)
	public ResponseEntity<ApyError> ApyAccountAlreadyPresent(ApyAccountAlreadyExists aaae){
		
		return new ResponseEntity<>(new ApyError("APY Account already exists",
				"It seems that you already have an APY account open. As per guidelines you can open only one APY account."),
				HttpStatus.NOT_FOUND);
		
	}
	
}
