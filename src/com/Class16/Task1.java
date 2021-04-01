package com.Class16;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create a string that will hold a sentence.
		 * Write a program to get a new String without any spaces.
		 */

		String words="This is a sentence";
		String wordsNoSpace=words.replace(" ", "");
		System.out.println(wordsNoSpace);
		
		/*
		 * Create a String that should be a combination of letters, 
		 * numbers and specials characters.
		 * Find out how many alpha characters are there in the String.
		 */
		String comb="hfofhbbAFHUAGVA%$$^4516461";
		String alphaChars=comb.replaceAll("[^a-zA-Z]", "");
		System.out.println("The number of Aplha characters are "+alphaChars.length());
		
		/*
		 * You have a String a ="Is it Saturday? Is it raining? Do we have a java Class today?";
		 * How would you find out how many sentences in that String?
		 */
		
		String a="Is it Saturday? Is it raining? Do we have a java Class today?";
		String[] b=a.split("[?]");
		System.out.println("The number of setences in the string is "+b.length);

	}

}
