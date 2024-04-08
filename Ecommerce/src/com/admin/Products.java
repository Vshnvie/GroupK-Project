package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.main.Admin;
import com.user.CommonMethods;

public class Products implements Admin {
	CommonMethods cm = new CommonMethods();
	Scanner sc = new Scanner(System.in);
	public void addProductIntoStore(){
        try {
        	cm.getConnection();
            String sql = "insert into products(id, name,description, price, quantity) "+ "values(?,?,?,?,?)";

            PreparedStatement statement = cm.getConnection().prepareStatement(sql);
            System.out.println("Please Enter Product Id");
            int id = sc.nextInt();
            statement.setInt(1, id);
            
            System.out.println("Please Enter Product Name");
            String name = sc.next();
            statement.setString(2, name);
            
            System.out.println("Please Enter Product Description");
            String description = sc.next();
            statement.setString(3, description);
            
            System.out.println("Please Enter Product Price");
            int price = sc.nextInt();
            statement.setInt(4, price);
            
            System.out.println("Please Enter Product Qty");
            int qty = sc.nextInt();
            statement.setInt(5, qty);
            
            statement.execute();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Insertion successful...");
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
	@Override
	public void viewCart(String userName) {
		// TODO Auto-generated method stub
		
	}
	
}