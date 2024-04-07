package com.main;

public interface Admin extends Main{
	
public void addProductIntoStore();
	
	public int calculateBill(String userName);
	
	public void displayBillAmount(String userName);
	
	public void checkQuantity(int id);
	
	public void checkUser(int userId);
	
	public void fetchUserHistory(String userName);

}
