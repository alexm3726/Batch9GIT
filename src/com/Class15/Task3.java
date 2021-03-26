package com.Class15;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Create a String and if the String is not
		 * empty perform the following
		 * ----->if the String has an odd number of
		 * characters and has 3 or more 
		 * characters, print the character in the
		 * middle of the string
		 */
		
		String word="Bacon";
		int middleChar;
		
		if(!word.isEmpty()) {
			if(word.length()%2==1 && word.length()>=3) {
				middleChar=(word.length()/2);
				System.out.println("The middle character is " +word.charAt(middleChar));
			}
		}
		
		/*
		 * 
		 * Create a String and print it in reverse
		 * order (Sunday---> yadnuS).
		 * 
		 */
		
		String regular="Sunday";
		String reverse="";
		
		for (int i=regular.length()-1; i>=0; i--) {
			reverse+=regular.charAt(i);
		}
		System.out.println(reverse);

	}

}
