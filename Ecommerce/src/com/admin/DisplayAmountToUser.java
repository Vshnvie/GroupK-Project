package com.admin;

import com.customexceptions.IncorrectUserCredentials;
import com.main.Admin;
import com.user.CommonMethods;

public class DisplayAmountToUser implements Admin {
	CalculateBill cb = new CalculateBill();
	CommonMethods cm = new CommonMethods();
	
public void displayBillAmount(String userName) {
	
	if(cm.validate(userName)==true) {
		
		System.out.println("Total amount of your bill: "+cb.calculateBill(userName));
	}else {
		throw new IncorrectUserCredentials("Incorrect username or password. Please try again.");
	}
		
	}

@Override
public void userRegisteration() {
	// TODO Auto-generated method stub
	
}

@Override
public void login(String userName, String password) {
	// TODO Auto-generated method stub
	
}

@Override
public void viewItems() {
	// TODO Auto-generated method stub
	
}

@Override
public void userAddsProductToCart(int productId, int qty) {
	// TODO Auto-generated method stub
	
}

@Override
public void purchaseItem(String userName) {
	// TODO Auto-generated method stub
	
}

@Override
public void viewItemAsGuest(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public void purchaseItemAsGuest() {
	// TODO Auto-generated method stub
	
}

@Override
public void addProductIntoStore() {
	// TODO Auto-generated method stub
	
}

@Override
public int calculateBill(String userName) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void checkQuantity(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public void checkUser(int userId) {
	// TODO Auto-generated method stub
	
}

@Override
public void fetchUserHistory(String userName) {
	// TODO Auto-generated method stub
	
}

@Override
public void insertProductDataIntoTable(String userName) {
	// TODO Auto-generated method stub
	
}

@Override
public void viewCart(String userName) {
	// TODO Auto-generated method stub
	
}



}
