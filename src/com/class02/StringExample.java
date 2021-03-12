package com.class02;

public class StringExample {

	public static void main(String[] args) {
		
		String name;
		name="Chris";
		
		String greeting="Good Morning";
		String phonenumber="123-456-7890";
		
		String stringNumber="12";
		
		String space=" ";
		
		String letter="A";
		String letter2="A ";
		char oneLetter='A';
		
		
		
		//Hello, my name is Chris
		
		System.out.println("Hello, my name is "+ name);
		
		// How are you Chris
		
		System.out.println("How are you " + name);
		
		int age=25;
		// I am 25
		
		System.out.println( "I am " + age);
		
		char grade='A';
		
		//Chris is an a student
		
		System.out.println(name + " is an " + grade + " student");
		
		/*
		 * String concatenation + operator can be used 
		 * when we attach String to another String
		 * we attach String to a number
		 * we attach String to any character or boolean
		 * 
		 */
		
		
		String car="Tesla";
		int year=2021;
		
		
		// i drive 2021 tesla
		
		System.out.println("I drive " + year + " " + car);
		
		
		String computer="Macbook";
		int memory=250;
		
		// Chris has Macbook with 250 GB memory
		
		System.out.println(name+" has " + computer+" with "+ memory+" GB memory");
		
				
		String combinedValue= year+" "+car;
		System.out.println(combinedValue);
		
		byte day=7;
		String month="February ";
		
		String date=month+day;
		System.out.println(date);
				
		//task
		
		
		String myName= "Jose";
		String lastName=" Moreno";
		char myGrade='A';
		String cityAndState=" Arlington, VA ";
		String myNumber="1800-555-5555";
		
		System.out.println("My name is "+ myName + " and my last name is"  + lastName);
		System.out.println("I am "+myGrade+ " student");
		System.out.println("I live in"+ cityAndState);
		System.out.println("And my phone number is "+ myNumber);
		
		myGrade='B';
		cityAndState="New York, New York";
		myNumber="1800-777-7777";
		
		System.out.println( "My name is "+ myName + lastName + " and I moved to " + cityAndState + " and my new number is " +myNumber);
		
		
		
				
		
		
		
		

	}

}
