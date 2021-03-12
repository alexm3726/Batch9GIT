package com.class02;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
	
		
		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2);//21HelloHi
		System.out.println(num1+str1+num2+str2);//10Hello11Hi
		
		System.out.println(str1+str2+num1+num2);//HelloHi1011
		
		/*
		 * when there is a string on either the left or right 
		 * and is attached to a variable it will concatenate instead of performing addition
		 * the string is bully and will change anything into a new string
		 */
		
		String result=str1+str2+(num1+num2);//if you add parenthesis to the int variables it will perform addition
		System.out.println(result);
	}

}
