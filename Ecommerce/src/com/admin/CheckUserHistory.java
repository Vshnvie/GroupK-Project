package com.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.main.Admin;
import com.user.CommonMethods;

public class CheckUserHistory implements Admin {
	
	CommonMethods cm = new CommonMethods();
	
	public void fetchUserHistory(String userName) {
		cm.getConnection();
		
		String fetchUserHistory = "select productId, description, productQty from products inner join user_purchase_data on products.id = user_purchase_data.productId where userName = ?";
		
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(fetchUserHistory);
			
			ps.setString(1, userName);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Product Id Purchased: "+ rs.getInt(1));
				System.out.println("Product Description: " + rs.getString(2));
				System.out.println("Quantity of product purchased: " + rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	public void insertProductDataIntoTable(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewCart(String userName) {
		// TODO Auto-generated method stub
		
	}

	

}
