package com.admin;

public class DisplayAmountToUser {
	CalculateBill cb = new CalculateBill();
	
public void displayBillAmount(String userName) {
		
		System.out.println("Total amount of your bill: "+cb.calculateBill(userName));
		
	}

}
