package com.user;
import java.util.Scanner;
public class User {
	

   private String firstName;
	    private String lastName;
	    private String username;
	    private String password;
	    private String city;
	    private String email;
	    private String mobileNumber;

	    public User(String first_Name, String last_Name, String username, String password, String city, String email, String mobile_Number) {
	        this.firstName = first_Name;
	        this.lastName = last_Name;
	        this.username = username;
	        this.password = password;
	        this.city = city;
	        this.email = email;
	        this.mobileNumber = mobile_Number;
	    }


		

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public static void addUser(User newUser) {
			
			
		}


		public static boolean validate(String loginUsername, String loginPassword) {
		
			return false;
		}


}
