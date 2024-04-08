package com.customexceptions;

public class ProductQuantityOutOfStock extends RuntimeException {
	
	public ProductQuantityOutOfStock(String message) {
		super(message);
	}

}
