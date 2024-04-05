package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Products {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "yes12345");
            Statement statement = con.createStatement();
            String sql = "insert into products(id, name,description, price, quantity) "+ "values(10,'Wireless router','Router with high speed internet connectivity and advanced security',3400,80)";
            statement.execute(sql);
        } 
        catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Insertion successful...");
    }
}