package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonMethods {
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_development", "root", "Rahul@2411");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public boolean validate(String loginUsername) {

		String sql = "SELECT * FROM user WHERE username = ?";
		PreparedStatement statement;
		try {
			getConnection();
			
			statement = getConnection().prepareStatement(sql);

			statement.setString(1, loginUsername);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}


}
