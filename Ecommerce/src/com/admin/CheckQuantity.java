package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckQuantity {
    public static void main(String[] args) {
        try {
           
        	Connection connection = Common.getConnection();

            String sql = "SELECT quantity FROM products WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product ID: ");
            int id = scanner.nextInt();

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int quantity = resultSet.getInt("quantity");
                System.out.println("Quantity of product with ID " + id + " is: " + quantity);
            } else {
                System.out.println("Product with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
