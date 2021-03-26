package com.Class15;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String momName;
		String dadName;
		String boyOrGirl;
		
		System.out.println("What is the Mother's name?");
		momName=sc.nextLine();
		System.out.println("What is the Father's name?");
		dadName=sc.nextLine();
		System.out.println("Boy or Girl?");
		boyOrGirl=sc.nextLine();
		String dadsPart="";
		String momsPart="";
		String boyName;
		if(boyOrGirl.equalsIgnoreCase("boy")) {
			dadsPart=dadName.substring(0,3);
			momsPart=momName.substring(momName.length()-2);
			System.out.println("Suggested  baby name: "+dadsPart+momsPart);
		}else {
			dadsPart=dadName.substring(dadName.length()-3);
			momsPart=momName.substring(0,2);
			System.out.println("Suggested baby name: "+momsPart+dadsPart);
		}
		

	}

}
