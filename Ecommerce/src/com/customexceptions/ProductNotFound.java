package com.customexceptions;

public class ProductNotFound extends RuntimeException {
	
	public ProductNotFound(String message) {
		super(message);
	}

}
