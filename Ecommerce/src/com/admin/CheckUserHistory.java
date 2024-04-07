package com.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.CommonMethods;

public class CheckUserHistory {
	
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

}
