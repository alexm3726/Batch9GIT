package com.reviewClass04;

public class SimpleWhileLoop2 {

	public static void main(String[] args) {
		
		int i=10;
		while(i<=15) {
			
			
			if(i<15) {
				System.out.println("Infinite");
				continue;
				
			}else {
				System.out.println("Hi");
			}
			i++;
		}

	}

}
