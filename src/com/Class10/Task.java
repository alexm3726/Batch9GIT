package com.Class10;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Create an array of names and store all names of your group. Then print
		 *  your name from that array. (use 2 different ways of creating an array).
		 * 
		 * 
		 */
		
		String[] names=new  String[6];
		names[0]="July";
		names[1]="December";
		names[2]="April";
		names[3]="September";
		names[4]="January";
		names[5]="Jose";
		
		String[] names1= { "July", "December", "April", "September", "January", "Jose"};
		
		System.out.println("My name is "+names[5]);
		
		/*
		 * 
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”
		 * 
		 */
		
		String[] words={"Java", "is", "Saturday", "Day","coding"};
		System.out.println(	words[2]+" "+ words[1]+" "+words[0]+" "+words[4]+" "+words[3]);
		
		//how to get all elements from an array
		for(int i=0; i<words.length; i++) {
			
			System.out.println(words[i]);
		}
	}

}
