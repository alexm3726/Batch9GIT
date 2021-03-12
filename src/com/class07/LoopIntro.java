package com.class07;

public class LoopIntro {

	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		System.out.println("-----------------------------");

		int time = 7;

		if (time < 12) {
			System.out.println("Hello");// code executes one time
		}

		System.out.println("------------WHILE LOOP-------------------");

		while (time < 12) {
			System.out.println("Hello");// code runs infinitely
			time++;// keeps repeating condition of code while condition is true
			// in this case adding one each loop
		}

		System.out.println("------------ print numbers from 1-10---------------");

		int num = 1;

		while (num < 11) {

			System.out.println(num);
			num++;

		}
		System.out.println("------------ print numbers from 20-40---------------");

	 num = 20;

		while (num <= 40) {

			System.out.print(num+" ");
			num++;
		}
		
		System.out.println();
		System.out.println("------------ print numbers from 10-1---------------");

		 int a = 10;

		while (a>=1) {

			System.out.print(a+" ");
			a--;
		}

	}

}
