package com.main;

public interface User extends Main {
	
	public void userRegisteration();
	
	public void login(String userName, String password);
	
	public void viewItems();
	
	public void userAddsProductToCart(int productId, int qty);
	
	public void viewCart(String userName);
	
	public void purchaseItem(String userName);


}
