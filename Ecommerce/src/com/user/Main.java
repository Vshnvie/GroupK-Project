package com.user;

import java.sql.SQLException;
import java.util.Scanner;

import com.admin.CheckUserHistory;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		
		BuyProduct bp = new BuyProduct();
		PurchaseItem pi = new PurchaseItem();
		
//		CheckUserHistory cuh = new CheckUserHistory();
//		System.out.println("Please enter your username to see your purchase history");
//		String userName = scanner.next();
//		cuh.fetchUserHistory(userName);
		System.out.println("Please enter product id");
		int productId = scanner.nextInt();
		
		System.out.println("Please enter qty");
		int qty = scanner.nextInt();
		
		bp.userAddsProductToCart(productId, qty);
		System.out.println("Please enter your user name to Purchase above items");
		String userName = scanner.next();
		
		bp.insertProductDataIntoTable(userName);
		
		pi.purchaseItem(userName);
		
		

//		System.out.println("Sign Up");
//		System.out.println("Enter the id:");
//		int id = scanner.nextInt();
//		scanner.nextLine();
//
//		System.out.println("Enter the first name:");
//		String firstName = scanner.nextLine();
//
//		System.out.println("Enter the last name:");
//		String lastName = scanner.nextLine();
//
//		System.out.println("Enter the username:");
//		String username = scanner.nextLine();
//
//		System.out.println("Enter the password:");
//		String password = scanner.nextLine();
//
//		System.out.println("Enter the city:");
//		String city = scanner.nextLine();
//
//		System.out.println("Enter the email:");
//		String email = scanner.nextLine();
//
//		System.out.println("Enter the mobile number:");
//		int mobileNumber = scanner.nextInt();
//
//		Userregistration.User(id, firstName, lastName, username, password, city, email, mobileNumber);
//		System.out.println("User signed up successfully!");
//
//		System.out.println("Login");
//		System.out.println("Enter your username:");
//		String loginUsername = scanner.next();
//
//		System.out.println("Enter your password:");
//		String loginPassword = scanner.next();
//
//		if (Userregistration.validate(loginUsername, loginPassword)) {
//			System.out.println("Login successful!");
//		} else {
//			System.out.println("Incorrect username or password. Please try again.");
//		}
	
	}
}