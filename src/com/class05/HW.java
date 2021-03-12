package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		
		/*
		 * Create Java program that will ask if user has a credit card or not.
		 * If user does not have a credit card then offer them.
		 * If they do have one ask them what is balance on card
		 * If balance on card is larger than 1000, tell them to pay off immediately
		 * otherwise you can tell them that they can spend more
		 */
		
		
		
		String creditCard;
		double balance;
		Scanner scan;
		
		
		scan=new Scanner(System.in);
		System.out.println("Do you have a credit card");
		creditCard=scan.next();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("Whats the balance on cc");
			balance=scan.nextDouble();
			if (balance>1000) {
				System.out.println("pay off immediately");
			}else {
				System.out.println("spend more");
			}
	} else {
		System.out.println("Would you like a credit card");
	}
		
		System.out.println("------------------------------------------------");
		
		int mark;
	    String grade="0";
	    System.out.println("Please enter your mark");
	    Scanner sc=new Scanner(System.in);
	    mark=sc.nextInt();

	    if(mark>=1 && mark<=25){
	      grade= "F";
	     	    }else if(mark>25 && mark<=45){
	      grade= "E";
	    }else if (mark>45 && mark<50){
	      grade= "D";
	    }else if (mark>50 && mark<=60){
	      grade="C";
	    }else if (mark>60 && mark<=80){
	      grade="B";
	    }else if (mark>80){
	      grade= "A";
	    }else {
	      System.out.println("Please enter valid mark");
	    }
	    System.out.println("Your grade is "+grade);

	}
	

}
