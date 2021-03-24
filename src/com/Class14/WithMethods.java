package com.Class14;

public class WithMethods {
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=-1;
		int num3=0;
		int num4=1000;
		checkNumbers(num1);
		checkNumbers(num2);
		checkNumbers(num3);
		checkNumbers(num4);
		
		
	}
	
	public static void checkNumbers(int a) {
		
		if(a>0) {
			System.out.println(a+" is greater than 0");
		}else if(a<0) {
			System.out.println(a+" is less than 0");
		}else {
			System.out.println(a+" is 0");
		}
	}

}
