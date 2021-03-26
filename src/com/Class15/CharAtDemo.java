package com.Class15;

public class CharAtDemo {

	public static void main(String[] args) {
		
		
		String name="Roheen";
		System.out.println(name.charAt(1));
		int sum=0;
		for(int i=0; i<name.length(); i++) {
		
			if(name.charAt(i)=='e') {
				
				sum++;
			}
		}
		System.out.println(sum +" es found");

	}

}
