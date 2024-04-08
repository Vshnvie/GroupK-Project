package com.customexceptions;

public class CanNotPurchaseItemAsGuest extends RuntimeException {
	
	public CanNotPurchaseItemAsGuest (String message) {
		super(message);
	}

}
