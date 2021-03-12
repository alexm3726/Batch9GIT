package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int num=6;
		
		while (num<=5) {
			System.out.println("Hello");
			num++;
		}
		
		
		System.out.println("------------ Do while----------");
		
		int num1=1;
		
		do {
			
			System.out.println(num1);
			num++;
		}while(num<=5);
		
		/*
		 * 
		 * While= first check then execute
		 * Do= first execute then check
		 * 
		 * even when condition is false Do will execute your code at least once
		 */
		
		
	}

}
