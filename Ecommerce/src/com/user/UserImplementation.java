package com.user;
import com.main.*;

import java.util.Scanner;

public class UserImplementation implements User {
	
	Scanner scanner = new Scanner(System.in);
	UserRegistration ur = new UserRegistration();
	
	public void userRegisteration() {
		
		System.out.println("Sign Up");
		System.out.println("Enter the id:");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the first name:");
		String firstName = scanner.nextLine();

		System.out.println("Enter the last name:");
		String lastName = scanner.nextLine();

		System.out.println("Enter the username:");
		String username = scanner.nextLine();

		System.out.println("Enter the password:");
		String password = scanner.nextLine();

		System.out.println("Enter the city:");
		String city = scanner.nextLine();

		System.out.println("Enter the email:");
		String email = scanner.nextLine();

		System.out.println("Enter the mobile number:");
		int mobileNumber = scanner.nextInt();

		ur.user(id, firstName, lastName, username, password, city, email, mobileNumber);
		System.out.println("User signed up successfully!");
	
	}
	
	public void login(String userName, String password) {

		if (ur.validate(userName, password)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Incorrect username or password. Please try again.");
		}
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
	public void checkUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchUserHistory(String userName) {
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
	public void insertProductDataIntoTable(String userName) {
		// TODO Auto-generated method stub
		
	}

}