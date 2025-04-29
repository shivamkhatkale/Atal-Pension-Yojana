package com.ubi.app.exception;

public class ApyAccountAlreadyExists extends RuntimeException {

	public ApyAccountAlreadyExists() {
		super();
	}

	public ApyAccountAlreadyExists(String message) {
		super(message);
	}

}
