package com.user;
import java.sql.*;
import java.util.Scanner;
public class Userregistration {
	 public static void User( int id,String first_name, String last_name,String username, String password,String city,String email,int mobile_number)throws SQLException {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "yes12345");
	            String sql = "INSERT INTO user(id, first_name, last_name, username, password, city, email, mobile_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	            PreparedStatement statement = connection.prepareStatement(sql);
	      
				statement.setInt(1, id);
	            statement.setString(2, first_name);
	            statement.setString(3, last_name);
	            statement.setString(4, username);
	            statement.setString(5, password);
	            statement.setString(6,city);
	            statement.setString(7, email);
	            statement.setInt(8, mobile_number);
	            statement.executeUpdate();
	         
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        System.out.println("User added successfully!");
   
	 }

	     public static boolean validate(String loginUsername, String loginPassword) {
	    		    try {
	    		        Class.forName("com.mysql.cj.jdbc.Driver");
	    		        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "yes12345");
	    		        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
	    		        PreparedStatement statement = connection.prepareStatement(sql);
	    		        statement.setString(1, loginUsername);
	    		        statement.setString(2, loginPassword);
	    		        ResultSet resultSet = statement.executeQuery();

	    		    
	    		        if (resultSet.next()) {
	    		            return true;
	    		        }
	    		    } catch (ClassNotFoundException | SQLException e) {
	    		        e.printStackTrace();
	    		    }
	    		  
	    		    return false;
	    		}
	    
	 }

