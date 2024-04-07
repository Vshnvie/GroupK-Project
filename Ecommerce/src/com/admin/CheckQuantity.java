package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.Admin;
import com.user.CommonMethods;

public class CheckQuantity implements Admin {
	CommonMethods cm = new CommonMethods();
    public void checkQuantity(int id) {
        try {
        	cm.getConnection();

            String sql = "SELECT quantity FROM products WHERE id = ?";
            PreparedStatement preparedStatement = cm.getConnection().prepareStatement(sql);
            
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int quantity = resultSet.getInt("quantity");
                System.out.println("Quantity of product with ID " + id + " is: " + quantity);
            } else {
                System.out.println("Product with ID " + id + " not found.");
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
	public void checkUser(int userId) {
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

}
