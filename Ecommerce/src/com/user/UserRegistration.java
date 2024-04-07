package com.user;

import java.sql.*;
import java.util.Scanner;

public class UserRegistration {

	static CommonMethods cm = new CommonMethods();

	public void user(int id, String first_name, String last_name, String username, String password, String city,
			String email, int mobile_number) {

		String sql = "INSERT INTO user(id, first_name, last_name, username, password, city, email, mobile_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement statement;
		try {
			cm.getConnection();
			
			statement = cm.getConnection().prepareStatement(sql);

			statement.setInt(1, id);
			statement.setString(2, first_name);
			statement.setString(3, last_name);
			statement.setString(4, username);
			statement.setString(5, password);
			statement.setString(6, city);
			statement.setString(7, email);
			statement.setInt(8, mobile_number);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("User added successfully!");

	}

	public boolean validate(String loginUsername, String loginPassword) {

		String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
		PreparedStatement statement;
		try {
			cm.getConnection();
			
			statement = cm.getConnection().prepareStatement(sql);

			statement.setString(1, loginUsername);
			statement.setString(2, loginPassword);
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
