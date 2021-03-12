package com.class07;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			System.out.println("Hello");
		}

		System.out.println("--------------Print Numbers from 1-50----------------");

		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------Print Numbers from 10-1----------------");

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------------What is my outpout?----------------");

		for (int a = 0; a <= 10; a++) {
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("--------------What is my outpout?----------------");

		for (int i = 5; i <= 50; i += 10) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------------What is my outpout?----------------");

		int sum = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print(i + " ");

			sum = sum + i;
		}
		System.out.println(sum);

	}

}
