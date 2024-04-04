package com.user;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);

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

		Userregistration.User(id, firstName, lastName, username, password, city, email, mobileNumber);
		System.out.println("User signed up successfully!");

		System.out.println("Login");
		System.out.println("Enter your username:");
		String loginUsername = scanner.next();

		System.out.println("Enter your password:");
		String loginPassword = scanner.next();

		if (Userregistration.validate(username, password)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Incorrect username or password. Please try again.");
		}

	}
}