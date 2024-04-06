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
		 
		HashMap<Integer, Integer> s = purchaseItem.get(userName);
		
		Set sv = s.keySet();
		
		Iterator itr = sv.iterator();
		
		Object i = itr.next();
		
		System.out.println(i);
	}
	
	public static void main(String [] args) {
		PurchaseItem pi = new PurchaseItem();
		pi.userPurchaseItem("Ram");
	}
	
	

}
