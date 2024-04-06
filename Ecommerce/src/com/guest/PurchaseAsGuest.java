package com.guest;

import java.util.Scanner;

public class PurchaseAsGuest {

	public void purchaseItemAsGuest() {

		ViewItemAsGuest viewItem = new ViewItemAsGuest();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter product id");
		int id = sc.nextInt();

		viewItem.viewItem(id);

		System.out.println("Do you want to go ahead and purchase this item? " + "Yes/No");

		System.out.println("Please enter your choice");

		String input = sc.next();

		if (input.equalsIgnoreCase("Yes")) {
			System.out.println("Are you a registered user? " + "Yes/No");

			System.out.println("Please enter your choice");

			String input1 = sc.next();
			if (input1.equalsIgnoreCase("Yes")) {

			} else {
				System.out.println("You can not proceed to checkout as Guest.");

				System.out.println("Please register first to complete your purchase.");
			}

		} else {
			System.out.println("Thank you for visiting" + " { ecommerce.com } " + "website");
		}

	}

}
