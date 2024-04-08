package com.guest;

import java.util.Scanner;

import com.customexceptions.CanNotPurchaseItemAsGuest;
import com.main.Guest;

public class PurchaseAsGuest implements Guest {

	public void purchaseItemAsGuest() {

		ViewItemAsGuest viewItem = new ViewItemAsGuest();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter product id");
		int id = sc.nextInt();

		viewItem.viewItemAsGuest(id);

		System.out.println("Do you want to go ahead and purchase this item? " + "Yes/No");

		String input = sc.next();

		if (input.equalsIgnoreCase("Yes")) {
			System.out.println("Are you a registered user? " + "Yes/No");

			System.out.println("Please enter your choice");

			String input1 = sc.next();
			if (input1.equalsIgnoreCase("No")) {
				throw new CanNotPurchaseItemAsGuest("You can not proceed to checkout as Guest. " + "Please register first to complete your purchase.");

			}

		} else {
			System.out.println("Thank you for visiting" + "[ ecommerce.com ]" + "website");
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
	public void insertProductDataIntoTable(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewCart(String userName) {
		// TODO Auto-generated method stub
		
	}


}
