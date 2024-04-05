package com.guest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.CommonMethods;

public class ViewItemAsGuest {
	
	CommonMethods cm = new CommonMethods();

	public void viewItem(int id) {

		try {
			String sql = "select * from products where product id = ?";
			
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


}
