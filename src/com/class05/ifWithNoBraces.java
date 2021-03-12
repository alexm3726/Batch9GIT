package com.class05;

public class ifWithNoBraces {
	
	public static void main(String[] args) {
		
		String day="friday";
		
		//with an if condition without{} only the first line will be part of the if block
		
		if (day.equals("Friday"))
			System.out.println("Today is my movie day");
		
		System.out.println("Tomorrow i have a class at Syntax");
		
		//if with braces
		
		if (day.equals("friday")) {
			System.out.println("Today is my movie day");
		
			System.out.println("Tomorrow i have a class at Syntax");
		}
		
		System.out.println("------------End of Program------------");
		
		
	}

}
