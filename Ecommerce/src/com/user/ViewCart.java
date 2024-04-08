package com.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Set;

import com.customexceptions.IncorrectUserCredentials;
import com.main.User;

public class ViewCart implements User{
	
	CommonMethods cm = new CommonMethods();
	HashMap<Integer, Integer> cartDetails = new HashMap<>();
	
	public void viewCart(String userName) {
		
		if(cm.validate(userName)==true) {

			String fetchCart = "select * from user_purchase_data where userName = ?";
			cm.getConnection();

			try {
				PreparedStatement ps = cm.getConnection().prepareStatement(fetchCart);

				ps.setString(1, userName);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int productId = rs.getInt(2);
					int productQty = rs.getInt(3);
					if (cartDetails.containsKey(productId)) {
						productQty = productQty + cartDetails.get(productId);
						cartDetails.put(productId, productQty);
					} else {
						cartDetails.put(productId, productQty);
					}
					
				}
				Set cart = cartDetails.keySet();
				
				for(Object o : cart) {
					System.out.println("Product Id in the cart: " + o);
					System.out.println("Qty of Product added : " + cartDetails.get(o));
					
					System.out.println("Product Item has been added to cart");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new IncorrectUserCredentials("Incorrect username or password. Please try again.");
		}

		
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
	public void viewItemAsGuest(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchaseItemAsGuest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProductDataIntoTable(String userName) {
		// TODO Auto-generated method stub
		
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

}
