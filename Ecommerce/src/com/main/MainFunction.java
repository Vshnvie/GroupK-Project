package com.main;

import java.util.Scanner;

import com.admin.*;
import com.user.*;
import com.guest.*;

public class MainFunction {
	
	Scanner sc = new Scanner(System.in);
	
	Admin addProduct = new Products();
	Admin displayAmount = new DisplayAmountToUser();
	Admin checkUserHistory = new CheckUserHistory();
	Admin checkRegisterdUser = new CheckRegisteredUser();
	Admin checkQuantity = new CheckQuantity();
	Admin calculateBill = new CalculateBill();
	
	User buyProduct = new BuyProduct();
	User purchaseItem = new PurchaseItem();
	User userImplementation = new UserImplementation();
	User viewItem = new ViewItem();
	
	Guest purchaseAsGuest = new PurchaseAsGuest();
	Guest viewItemAsGuest = new ViewItemAsGuest();
	
	BuyProduct buy = new BuyProduct();
	
	public void getUserInput(int input) {
		switch(input) {
		case 1 : 
			userImplementation.userRegisteration();
			break;
		case 2 :
			System.out.println("Please Enter Your UserName");
			String userName = sc.next();
			System.out.println("Please Enter Your Password");
			String password = sc.next();
			userImplementation.login(userName, password);
			break;
		case 3 :
			viewItem.viewItems();
			break;
		case 4 :
			System.out.println("Please Enter Product Id to Buy");
			int productId = sc.nextInt();
			System.out.println("Please Enter Qty to Buy");
			int qty = sc.nextInt();
			buyProduct.userAddsProductToCart(productId, qty);
			System.out.println("Please Enter Your Username to Proceed with Purchase");
			String userName1 = sc.next();
			buyProduct.insertProductDataIntoTable(userName1);
			break;
		case 6 :
			System.out.println("Please Enter Your Username to Proceed with Purchase");
			String userName4 = sc.next();
			purchaseItem.purchaseItem(userName4);
			break;
		case 7 :
			addProduct.addProductIntoStore();
			break;
		case 8 :
			System.out.println("Please Enter userName to Calculate Bill");
			String user = sc.next();
			calculateBill.calculateBill(user);
			break;
		case 9 :
			System.out.println("Please Enter userName to Dsiplay Bill Amount");
			String user2 = sc.next();
			displayAmount.displayBillAmount(user2);
			break;
		case 10 :
			System.out.println("Please Enter Product Id to check Quantity");
			int id = sc.nextInt();
			checkQuantity.checkQuantity(id);
			break;
		case 11 : 
			System.out.println("Please Enter User Id to check if User Is Registered");
			int userId = sc.nextInt();
			checkRegisterdUser.checkUser(userId);
			break;
		case 12 :
			System.out.println("Please Enter UserName to check user Purchase History");
			String username = sc.next();
			checkUserHistory.fetchUserHistory(username);
			break;
		case 13 : 
			System.out.println("Please Enter Product Id to view as Guest");
			int productIdGuest = sc.nextInt();
			viewItemAsGuest.viewItemAsGuest(productIdGuest);
			break;
		case 14 :
			purchaseAsGuest.purchaseItemAsGuest();
			break;
		default : 	
			System.out.println("In-Valid User Operation");
		}
	}
	
	public static void main(String [] args) {
		MainFunction mf = new MainFunction();
		System.out.println("Please Enter User Input");
		int input = mf.sc.nextInt();
		mf.getUserInput(input);
	}

}
