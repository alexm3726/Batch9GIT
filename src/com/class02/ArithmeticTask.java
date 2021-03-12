package com.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		
		
		int num1=75;
		int num2=99;
		float f1=100.01f;
		float f2=5.80f;
		
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		float divOfFloat=f1/f2;
		
		
		System.out.println("The sum of 2 numbers " +num1+ " and "+ num2+ " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " +num1+ " and "+ num2+ " is equal to " + sub);
		System.out.println("The multiplication of 2 numbers " +num1+ " and "+ num2+ " is equal to " + mult);
		System.out.println("The div of 2 numbers " +f1+ " and "+ f2+ " is equal to " + divOfFloat);
		
		double num3=3.9;
		double square=num3*num3;
		
		System.out.println("The square of the "+num3+ " is " + square);
		
		int width=5;
		int height=8;
		
		int perimeter=(width+height)*2;
		int area= width*height;
		
		System.out.println("The perimetere of a rectangle with width "+width+ " and height "+ height+ " is equal to " + perimeter + " and the area is " +area);
				
		
		//precedence ()---> * & / ----> + & -
		
		//modulus operator ---> shows the remainder of the division
		
		int mod=10%3;
		System.out.println("Remainder is = " + mod);

		int mod1=10%2;
		System.out.println("Remainder is = " + mod1);
		
		int mod2=15%4; //4*3=12; 15-12=3
		System.out.println("Remainder is = " + mod2);
		
		int r=(20%7)*3;
		System.out.println(r);


	}

}
