package com.corejavaPratice;

import java.util.Date;

public class User {

	// String is a class in java so if we want represent a group a character
	// we can string

	public String userName;
	private String password;
	private Date createDt;

	public String getUserName() {
		if (userNameLengthCheck()) {
			if (userName.startsWith("SAI")) {
				System.out.println(userName);
				return userName;

			} else {
				System.out.println("Test");
				return "Test";
			}
		} else {

			System.out.println(" Length check is Failed ");
			return "Test";
		}
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	User() {
		System.out.println(" This is Default Constructor");
	}
	// this will represent the currnet class variable



	public boolean userNameLengthCheck() {
		if (userName.length() > 0) {

			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		User userObject = new User();
		userObject.setPassword("Sairam123");
		userObject.setUserName("Sairam");

		userObject.getUserName();

	}

}
