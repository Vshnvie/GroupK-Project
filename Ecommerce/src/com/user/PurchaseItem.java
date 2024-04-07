package com.user;


import java.util.Scanner;


import com.admin.DisplayAmountToUser;

public class PurchaseItem {
	DisplayAmountToUser dsiplayAmount = new DisplayAmountToUser();
	Scanner sc = new Scanner(System.in);
	
	public void purchaseItem(String userName) {
		
		dsiplayAmount.displayBillAmount(userName);
	}
	
	
	}
	
	


