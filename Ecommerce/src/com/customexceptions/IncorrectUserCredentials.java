package com.customexceptions;

public class IncorrectUserCredentials extends RuntimeException {
	
	public IncorrectUserCredentials(String message) {
		super(message);
	}

}
