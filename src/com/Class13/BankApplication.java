package com.Class13;

public class BankApplication {

	public static void main(String[] args) {
		
		Account ghulamsAccount= new Account();
		
		ghulamsAccount.accountNumber="123";
		ghulamsAccount.userName="Ghulam123";
		ghulamsAccount.password="pass123";
		ghulamsAccount.balance=1400;
		
		//ghulamsAccount.login("Ghulam123", "pass123");
		
		ghulamsAccount.printUserNameAndPassword("ryan","Ahmed123");
		

	}

}
