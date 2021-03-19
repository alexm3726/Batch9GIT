package com.Class13;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserNameWhenLogging, String passedPasswordWhenLogging) {
		
		if(userName.equals(passedUserNameWhenLogging)&&password.equals(passedPasswordWhenLogging)) {
			System.out.println("Welcome to Bank of America your balance is "+ balance);
		}else {
			System.out.println("Username or password is not correct");
		}
	}
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your Account Number is "+ accountNumber+ " Your balace is "+balance);
		}
		
	}
	
	public void printUserNameAndPassword(String passedUserNameWhenLogging, String passedPasswordWhenLogging) {
		
		
		if(passedUserNameWhenLogging.equalsIgnoreCase("Bryan")) {
			System.out.println("Hi Bryan");
		}else {
			System.out.println("By Bryan");
		}
	}
	

}
