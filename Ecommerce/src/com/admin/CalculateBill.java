package com.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.main.Admin;
import com.user.CommonMethods;

public class CalculateBill implements Admin {
	
	CommonMethods cm = new CommonMethods();
	HashMap<Integer, Integer> cart = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	HashMap<String, HashMap<Integer, Integer>> addedProducts = new HashMap<>();
	HashMap<Integer, Integer> cartDetails;
	int availableQty;
	String productName;
	
	public HashMap<Integer, Integer> fetchCartDataforUser(String userName) {
		String fetchCart = "select * from user_purchase_data where userName = ?";
		cm.getConnection();

		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(fetchCart);

			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				cartDetails = new HashMap<>();
				int productId = rs.getInt(2);
				int productQty = rs.getInt(3);
				if (cartDetails.containsKey(rs.getInt(3))) {
					productQty = productQty + cartDetails.get(productId);
					cartDetails.put(productId, productQty);
				} else {
					cartDetails.put(productId, productQty);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cartDetails;
	}
	
	public int calculateBill(String userName) {
		int totalBill = 0;;
		String fetchPrice = "select * from user_purchase_data where userName = ?";
		
		cm.getConnection();
		try {
			PreparedStatement ps = cm.getConnection().prepareCall(fetchPrice);
				ps.setString(1, userName);
				ResultSet getPrice = ps.executeQuery();
				while(getPrice.next()) {
					System.out.println("Product Purchased: "+getPrice.getInt(2));
					System.out.println("Price of the Product: "+getPrice.getInt(4));
					System.out.println("Qty: "+getPrice.getInt(3));
					
					totalBill = totalBill+(getPrice.getInt(3)*getPrice.getInt(4));
					
				}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalBill;
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
	public void displayBillAmount(String userName) {
		// TODO Auto-generated method stub
		
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

}
