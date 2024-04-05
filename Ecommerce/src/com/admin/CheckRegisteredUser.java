package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckRegisteredUser {
    public static void main(String[] args) {
        try {
            Connection connection = Common.getConnection();

            String sql = "SELECT * FROM user WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter user ID: ");
            int id = scanner.nextInt();

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String city = resultSet.getString("city");
                String email = resultSet.getString("email");
                int mobileNumber = resultSet.getInt("mobile_number");
                
                System.out.println("User Details:");
                System.out.println("ID: " + id);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("City: " + city);
                System.out.println("Email: " + email);
                System.out.println("Mobile Number: " + mobileNumber);
            } else {
                System.out.println("User with ID " + id + " not found.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
