package com.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseItem {
	
	ResultSet rs;
	
	public void userPurchaseItem(String userName) {
		
		CommonMethods cm = new CommonMethods();
		
		cm.getConnection();
		
		String query = "select *  from addToCart where username = ?";
		
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(query);
			
			ps.setString(1, userName);
			
			ResultSet rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
