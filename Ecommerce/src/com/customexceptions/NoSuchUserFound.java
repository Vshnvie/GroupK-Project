package com.customexceptions;

public class NoSuchUserFound extends RuntimeException {
	
	public NoSuchUserFound(String message) {
		super(message);
	}

}
