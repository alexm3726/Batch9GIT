package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {

		/*
		 * 
		 * we play lottery and we have a magic number which is 17 we need to keep asking
		 * a user to enter any number from 1-100 Until correct number is entered
		 * 
		 * 
		 */

		Scanner input;
		int num;
		int lotteryNumber = 17;

		input = new Scanner(System.in);
		
		System.out.println("Please enter any number from 1-100 to win the lottery");
		num=input.nextInt();

		while(num!=lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num = input.nextInt();
		} 

		System.out.println("Congratulations you entered " + num + " which is a lucky number");

	}
}
