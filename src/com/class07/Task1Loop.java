package com.class07;

public class Task1Loop {

	public static void main(String[] args) {

		System.out.println("------------ print numbers from 1-100---------------");

		int num = 1;

		while (num <= 100) {

			System.out.print(num + " ");
			num++;

		}

		System.out.println();
		System.out.println("------------ print numbers from 100-1---------------");

		num = 100;

		while (num >= 1) {

			System.out.print(num + " ");
			num--;
		}

		System.out.println();
		System.out.println("------------ print  even numbers from 20-40--------------");

		num = 20;

		while (num <= 40) {

			System.out.print(num + " ");
			num += 2;
		}

	}

}
