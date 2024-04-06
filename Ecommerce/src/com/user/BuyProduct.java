package com.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BuyProduct {
	CommonMethods cm = new CommonMethods();
	HashMap<Integer, Integer> cart = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	HashMap<String, HashMap<Integer, Integer>> addedProducts = new HashMap<>();
	HashMap<Integer, Integer> cartDetails;
	int availableQty;
	String productName;

	public void userAddsProductToCart(int productId, int qty) {
		CommonMethods cm = new CommonMethods();
		cm.getConnection();

		String query = "select * from products where productId = ?";

		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(query);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			availableQty = rs.getInt(5);
			productName = rs.getString(2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (cart.get(productId) == null) {
			qty = qty + 0;
		}

		else if (cart.get(productId) != null) {
			qty = qty + (cart.get(productId));
		}
		if (availableQty >= qty) {
			cart.put(productId, qty);
		} else {
			System.out.println("Item has only " + availableQty + " units avaialble");
		}

		System.out.println("Do you want to view Cart: Yes/No");
		String cartInput = sc.next();
		if (cartInput.equalsIgnoreCase("Yes")) {
			Set k = cart.keySet();
			for (Object o : k) {
				System.out.println("Products in the cart >>" + o);
				System.out.println("Qty >>" + cart.get(o));
			}

		}

		System.out.println("Do you want to add any other product: Yes/No");
		String inputforAddProuct = sc.next();
		if (inputforAddProuct.equalsIgnoreCase("Yes")) {
			System.out.println("please enter product id for other product");
			int productId2 = sc.nextInt();

			System.out.println("please enter product qty");
			int qty2 = sc.nextInt();
			userAddsProductToCart(productId2, qty2);
		} else {
			System.out.println("Products added to the cart");
		}

	}

	public HashMap<Integer, Integer> fetchUserHistory(String userName) {
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
				if (cartDetails.containsKey(rs.getInt(productId))) {
					productQty = productQty + cartDetails.get(productId);
					cartDetails.put(productId, productQty);
				} else {
					cartDetails.put(productId, productQty);
				}
				System.out.println("Product Id added to cart: " + rs.getInt(2));
				System.out.println("Product qty added to cart: " + rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cartDetails;
	}

	public void purchaseItem(String userName) {

		String insertQuery = "insert into user_purchase_data(userName, productId, productQty) " + "values(?,?,?)";

		cm.getConnection();
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(insertQuery);
			Set s = cart.keySet();
			Iterator<Integer> itr = s.iterator();
			while (itr.hasNext()) {
				ps.setString(1, userName);
				ps.setInt(2, itr.next());
				ps.setInt(3, cart.get(itr.next()));

			}

			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("cart record inserted successfully");

	}

}
