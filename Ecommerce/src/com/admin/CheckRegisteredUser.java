package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.Admin;
import com.user.CommonMethods;

public class CheckRegisteredUser implements Admin {
	
	CommonMethods cm = new CommonMethods();
    public void checkUser(int userId) {
        try {
        	cm.getConnection();

            String sql = "SELECT * FROM user WHERE id = ?";
            PreparedStatement preparedStatement = cm.getConnection().prepareStatement(sql);

            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String city = resultSet.getString("city");
                String email = resultSet.getString("email");
                long mobileNumber = resultSet.getLong("mobile_number");
                
                System.out.println("User Details:");
                System.out.println("ID: " + userId);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("City: " + city);
                System.out.println("Email: " + email);
                System.out.println("Mobile Number: " + mobileNumber);
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void userRegisteration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String userName, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userAddsProductToCart(int productId, int qty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchaseItem(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewItemAsGuest(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchaseItemAsGuest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProductIntoStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateBill(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayBillAmount(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkQuantity(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchUserHistory(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProductDataIntoTable(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewCart(String userName) {
		// TODO Auto-generated method stub
		
	}


}
