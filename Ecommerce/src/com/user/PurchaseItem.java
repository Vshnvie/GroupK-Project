package com.user;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PurchaseItem {
	
	public void userPurchaseItem(String userName) {
		
		HashMap<Integer, Integer> qty = new HashMap<>();
		qty.put(14,10);
		
		HashMap<String, HashMap<Integer, Integer>> purchaseItem = new HashMap<>();
		
		purchaseItem.put(userName, qty);
		 
		Object s = purchaseItem.get(userName);
		
		System.out.println(s);
	}
	
	public static void main(String [] args) {
		PurchaseItem pi = new PurchaseItem();
		pi.userPurchaseItem("Ram");
	}
	
	

}
