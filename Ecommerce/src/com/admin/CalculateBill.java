package com.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.user.CommonMethods;

public class CalculateBill {
	
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

}
