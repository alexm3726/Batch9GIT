package com.Class08;

public class ForLoopReview {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * I want to create a multiplication table 
		 * 
		 * 1*1 =1
		 * 1*2=2
		 * 1*3=3
		 * 
		 * 
		 * 1*10=10
		 */
		
		int num=1;
		int mult;
		
		for (int i=1; i<=10; i++) {
			mult=num*i;
			System.out.println(num+"*"+i+"="+mult);
			
		}
		
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (-1 * line + 5); j++) {
			System.out.print(".");
			}
			for (int k = 1; k <= line; k++) {
			System.out.print(line);
			}
			System.out.println();
			}
		
	}

}
