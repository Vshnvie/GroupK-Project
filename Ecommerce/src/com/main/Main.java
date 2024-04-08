package com.main;

public interface Main {
	
	public void userRegisteration();
	
	public void login(String userName, String password);
	
	public void viewItems();
	
	public void userAddsProductToCart(int productId, int qty);
	
	public void viewCart(String userName);
	
	public void purchaseItem(String userName);
	
	public void addProductIntoStore();
	
	public int calculateBill(String userName);
	
	public void displayBillAmount(String userName);
	
	public void checkQuantity(int id);
	
	public void checkUser(int userId);
	
	public void fetchUserHistory(String userName);
	
	public void viewItemAsGuest(int id);
	
	public void purchaseItemAsGuest();
	
	public void insertProductDataIntoTable(String userName);

}
