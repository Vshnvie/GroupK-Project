package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewCart {
	public void cart() {
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/space", "username", "password");
			PreparedStatement ps = con.prepareStatement("Select * from   sqldatabase");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.print("Product has been placed.....");
			}
			con.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
