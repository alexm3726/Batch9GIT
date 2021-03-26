package com.Class15;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args ) {
		
		Scanner sc=new Scanner(System.in);
		String userName;
		String passWord;
		String passConfirm;
		
		System.out.println("Input username:");
		userName=sc.nextLine();
		System.out.println("Input pasword:");
		passWord=sc.nextLine();
		if(!userName.isEmpty() && !passWord.isEmpty()) {
			if(passWord.length()>7 && !passWord.contains(userName)) {
				System.out.println("Please confirm password:");
				passConfirm=sc.nextLine();
				if(passWord.equals(passConfirm)) {
					System.out.println("Your Username and Password has been created.");
				}else {
					System.out.println("Passwords do not match");
				}
			}else if (passWord.length()<8) {
				System.out.println("Password is too short.");
			}else if(passWord.contains(userName)) {
				System.out.println("Password cannot contain username");
			}
		}else {
			System.out.println("Username and Password cannot be empty");
		}
		
	}
	

}
