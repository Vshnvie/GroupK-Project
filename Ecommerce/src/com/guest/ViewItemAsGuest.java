package com.guest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.main.Guest;
import com.user.CommonMethods;

public class ViewItemAsGuest implements Guest {
	
	CommonMethods cm = new CommonMethods();

	public void viewItemAsGuest(int id) {

		try {
			String sql = "select * from products where id = ?";
			
			cm.getConnection();

			PreparedStatement ps = cm.getConnection().prepareStatement(sql);
			
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			
//			List l = (List) rs;
//			
//			Collections.sort(l);

			while (rs.next()) {
				System.out.println("Product Id Is: " + rs.getInt(1));
				System.out.println("Product Name Is: " + rs.getString(2));
				System.out.println("Product Desription Is: " + rs.getString(3));
				System.out.println("Product Price Is: " + rs.getInt(4));
				System.out.println("Product Quantity Is: " + rs.getInt(5));

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
	public void purchaseItemAsGuest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProductDataIntoTable(String userName) {
		// TODO Auto-generated method stub
		
	}


}
