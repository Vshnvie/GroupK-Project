package com.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserBuyProduct {
	
	 private String id;  
     private String name;  
     private int quntity;  
     private double price;  
     private double totalPrice;  
        
    
     UserBuyProduct(String id, String name, int quntity, double price, double totalPrice)   
     {  
         this.id=id;  
         this.name = name;  
         this.quntity = quntity;  
         this.price = price;  
         this.totalPrice = totalPrice;  
     }  
         
         public String getId()   
             {  
                 return id;  
             }  
             public String getname()   
             {  
                 return name;  
             }  
             public int getQuntity()   
             {  
                 return quntity;  
             }  
             public double getPrice()   
             {  
                 return price;  
             }  
             public double getTotalPrice()   
             {  
                 return totalPrice;  
             }  
  
     public static void main(String args[]){  
            
             String id = null;  
             String productName = null;  
             int quantity = 0;  
             double price = 0.0;  
             double totalPrice = 0.0;  
             double overAllPrice = 0.0;  
             char choice = '0';  
            
             Scanner scan = new Scanner(System.in);  
             System.out.print("Enter Customer Name: ");  
             String customername =scan.nextLine();  
            
             List product = new ArrayList();  
            
             for(int i = 0 ; i<= 10 ;i ++)    {  
                    
            	 System.out.println("Enter the product details: ");  
                     System.out.print("Product ID: ");  
                     id = scan.nextLine();  
                     
                     System.out.print("Product Name: ");  
                     productName = scan.nextLine();  
                    
                     System.out.print("Quantity: ");  
                     quantity = scan.nextInt();  
                     
                     System.out.print("Price (per unit): ");  
                     price = scan.nextDouble();  
                    
                     totalPrice = price * quantity;  
                     
                     overAllPrice = overAllPrice + totalPrice;  
                     System.out.println(overAllPrice);
                    
                     System.out.print("Want to add more items in veiw card ? (y or n): ");  
                     choice = scan.next().charAt(0);  
                     scan.nextLine();  
                 }   
    }
	

    }
