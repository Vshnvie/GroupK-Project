package com.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewItem {

	CommonMethods cm = new CommonMethods();

	public void viewItems() {

		try {
			String sql = "select * from products";

			PreparedStatement ps = cm.getConnection().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

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
