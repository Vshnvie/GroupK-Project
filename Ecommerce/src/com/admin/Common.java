package com.admin;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Common {
		public static Connection getConnection() {
			Connection connection = null;
			try {
		
				Class.forName("com.mysql.cj.jdbc.Driver");

		
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "yes12345");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;

		}

		public void setConnection() {
			// TODO Auto-generated method stub
			
		}
	}


