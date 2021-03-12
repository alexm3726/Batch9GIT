package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/*
		 * 
		 * we have to identify if number is small large and extra large
		 * if number is between 1 and 10 -----> small
		 * if number is between 11-100----> medium
		 * if number is between 101 and 1000----> large
		 * if number is between 1001 and 100000----> extra large
		 * 
		 */
		
		int num=0;
		
		
		if(num<1) {
			System.out.println("Number is 0 or negative");
			
		}else if (num>=1 && num<=10) {
			System.out.println(num +" is a small number");
		}else if (num>=11 && num<=100) {
			System.out.println(num+" is a medium number");
		}else if (num>=101 && num<=1000) {
			System.out.println(num+" is a large number");
		}else if (num>=1001 && num<=100000) {
			System.out.println(num+" is an extra large number");
		}else {
			System.out.println(num+" is a huge number");
		}
		

	}

}
