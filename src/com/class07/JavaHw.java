package com.class07;

public class JavaHw {
	public static void main(String[] args) {
		
		//Calculate the sum of odd and even numbers from 1 to 50
		
		int sumEven=0;
		
		for (int num=0; num<=50; num+=2) {
			
			sumEven= sumEven+num;
		}
		System.out.println(sumEven);
		System.out.println();
		
		System.out.println("----------------------");
		
int sumOdd=0;
		
		for (int i=1; i<=50; i+=2) {
	
			sumOdd= sumOdd+i;
		}
		System.out.println(sumOdd);
		System.out.println();
		
		
		System.out.println("------------------preferred way--------------");
		
		
int even=0;
int odd=0;
		
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("Sum of odd numbers equal to "+odd);
		System.out.println("Sum of even numbers equal to "+even);
			
			}

}
