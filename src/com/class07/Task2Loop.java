package com.class07;

public class Task2Loop {

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
		System.out.println("------------ print even numbers from 20 to 1 (2 ways)---------------");

		int z = 20;

		while (z >= 1) {

			System.out.print(z + " ");
			z -= 2;

		}
		System.out.println();
		System.out.println("------");
		int b = 20;

		while (b >= 1) {

			if (b % 2 == 0) {
				System.out.print(b + " ");
			}
			b--;
		}

		System.out.println();
		System.out.println("------------ print odd numbers from 20 and 50(2 ways)---------------");

		int a = 21;

		while (a <= 50) {

			System.out.print(a + " ");
			a += 2;

		}
		System.out.println();
		System.out.println("------");
		int d = 20;

		while (d <= 50) {

			if (d % 2 != 0) {
				System.out.print(d + " ");
			}
			d++;
		}
		System.out.println();
		System.out.println("-------------");

		for (int i = 20; i <= 50; i++) {

			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}
}
