package com.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.customexceptions.IncorrectUserCredentials;
import com.customexceptions.ProductNotFound;
import com.customexceptions.ProductQuantityOutOfStock;
import com.main.User;


public class BuyProduct implements User {
	CommonMethods cm = new CommonMethods();
	HashMap<Integer, Integer> cart = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	HashMap<String, HashMap<Integer, Integer>> addedProducts = new HashMap<>();
	HashMap<Integer, Integer> cartDetails;
	int availableQty;
	String productName;
	int productPrice;
	int productId;

	public void userAddsProductToCart(int productId, int qty) {
		CommonMethods cm = new CommonMethods();
		cm.getConnection();

		String query = "select * from products where id = ?";

		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(query);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			availableQty = rs.getInt(5);
			productName = rs.getString(2);
			productPrice = rs.getInt(4);
			this.productId = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(productId==this.productId) {

		if (cart.get(productId) == null) {
			qty = qty + 0;
		}

		else if (cart.get(productId) != null) {
			qty = qty + (cart.get(productId));
		}
		if (availableQty >= qty) {
			cart.put(productId, qty);
		} else {
			throw new ProductQuantityOutOfStock("Product Out Of Stock. "+"Item has only " + availableQty + " units avaialble.");
		}

		System.out.println("Do you want to add any other product: Yes/No");
		String inputforAddProuct = sc.next();
		if (inputforAddProuct.equalsIgnoreCase("Yes")) {
			System.out.println("please enter product id for other product");
			int productId2 = sc.nextInt();

			System.out.println("please enter product qty");
			int qty2 = sc.nextInt();
			userAddsProductToCart(productId2, qty2);
		} else {
			System.out.println("Do you want to view Cart: Yes/No");
			String cartInput = sc.next();
			if (cartInput.equalsIgnoreCase("Yes")) {
				Set<Integer> k = cart.keySet();
				for (Integer o : k) {
					System.out.println("Products in the cart >>" + o);
					System.out.println("Qty >>" + cart.get(o));
					updateInventory(o, cart.get(o));
				}
	
			}
		}
		}else {
			throw new ProductNotFound("No Such Product Found");
		}

	}
	
	public int getInventory(int productId) {
		
		cm.getConnection();
		int qty=0;
		String getQty = "select quantity from products where id = ?";
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(getQty);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			qty = rs.getInt(1);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qty;	
	}
	
	public void updateInventory(int productId, int purchasedQty) {
		cm.getConnection();
		int updatedQty;
		updatedQty = getInventory(productId) - purchasedQty;
		String setQty = "update products set quantity = ? where id = ?";
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(setQty);
			ps.setInt(1, updatedQty);
			ps.setInt(2, productId);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public int getPrice(int productId) {
		cm.getConnection();
		int price=0;
		String getPrice = "select price from products where id = ?";
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(getPrice);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			price = rs.getInt(1);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return price;
	}
	

	public void insertProductDataIntoTable(String userName) {
		
		if(cm.validate(userName)==true) {

		String insertQuery = "insert into user_purchase_data(userName, productId, productQty, productPrice) " + "values(?,?,?,?)";

		cm.getConnection();
		try {
			PreparedStatement ps = cm.getConnection().prepareStatement(insertQuery);
			Set<Integer> s = cart.keySet();
			
			for (Integer i : s) {
				ps.setString(1, userName);
				ps.setInt(4, getPrice(i));
				ps.setInt(2, i);
				ps.setInt(3, cart.get(i));
				
				ps.execute();

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("cart record inserted successfully");
		} else {
			throw new IncorrectUserCredentials("Incorrect username or password. Please try again.");
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
	public void viewCart(String userName) {
		// TODO Auto-generated method stub
		
	}

}
