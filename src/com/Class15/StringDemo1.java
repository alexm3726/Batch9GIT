package com.Class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name="Azizi";//Mostly used because of shorter syntax
		String name1=new String("Azizi");// creating object of String Class
		
		System.out.println(name);
		//length=> number of characters in a String object
		System.out.println(name.length());
		name="     Azizi";
		int len=name.length();
		System.out.println(len);
		//
		

	}

}
