package com.Class08;

import java.util.Scanner;

public class Task2Class08 {

	public static void main(String[] args) {

		int start;
		int end;
		int sumEven = 0;
		int sumOdd = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input range of integers");
		System.out.println("Start: ");
		start = sc.nextInt();
		System.out.println("End:");
		end = sc.nextInt();
		if (start < end) {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd += i;
				}

			}
			
		}else if(start >end) {
			for (int i=end; i<=start; i++) {
				if (i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd += i;
				}
				
		}
		}	
			System.out.println("The sum of the even integers in the range provided by user is  " + sumEven);
			System.out.println("The sum of the odd integers in the range provided by user is  " + sumOdd);
			
		System.out.println();
		System.out.println("---------------Second Part-------------");

		String item;
		int price;
		int money;

		System.out.println("What item would you like to buy?");
		item = sc.next();
		System.out.println("What is the price?");
		price = sc.nextInt();
		System.out.println("Insert money");
		money = sc.nextInt();

		do {

			if (money < price) {
				System.out.println("Please insert $ " + (price - money));
				money += sc.nextInt();
				if (money == price) {
					System.out.println("That's the right amount");
				}
			} else if (money > price) {
				System.out.println("Your change is $" + (money - price));
				break;
			} else {
				System.out.println("That's the right amount");
			}

		} while (money != price);
		
		System.out.println("Thank you for shopping");

	}

}
