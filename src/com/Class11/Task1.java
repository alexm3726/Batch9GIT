package com.Class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array on double values using scanner
		 * calculate the sum of all stored variables in that array
		 */
		
		Scanner sc;
		double sum=0;
		
		sc=new Scanner(System.in);
		System.out.println("How many elements would you like in your array?");
		int size=sc.nextInt();
		Double[] array=new Double[size];
		for(int i=0; i<size; i++) {
			System.out.println("Please enter what you want to store");
			array[i]=sc.nextDouble();
			sum+=array[i];
		}
		System.out.println("the sum of Values stored in array "+sum);
		sum=0;
		for(double num:array) {
			sum+=num;
		}
		System.out.println("the sum of the values stored in array "+sum);
		}
		
	}


