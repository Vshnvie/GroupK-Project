package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonMethods {
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "yes12345");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

}
