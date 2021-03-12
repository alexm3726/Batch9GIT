package com.Class08;

import java.util.Scanner;

public class DoWhileLoopReview {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * we need to make user to pay for a soda keep asking user to pay until it
		 * enters 3
		 * 
		 * if user gives more > 3----> please give less money if user gives less than 3
		 * ---> please give more money
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("pay for soda");

		int pay;

		do {

			pay = sc.nextInt();

			if (pay > 3) {
				System.out.println("Please give less money");
			} else if (pay < 3) {
				System.out.println("Please give more money");
			}

		} while (pay != 3);
		System.out.println("Thank you");

	}

}
