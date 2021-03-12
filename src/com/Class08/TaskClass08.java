package com.Class08;

import java.util.Scanner;

public class TaskClass08 {

	public static void main(String [] args) {
		
		System.out.println("----Numbers from 1 to 50 except those divisible by 3-------");
		
		for (int i=1; i<=50; i++) {
			
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		System.out.println("------------Credit card task--------------");
		
		String creditCard, creditCard2;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Do you want to apply for a credit card");
			creditCard=sc.nextLine();
			
			
		}while(!creditCard.equalsIgnoreCase("yes"));
		
		
		
		System.out.println("------------------Another Way------------------------------");
		
		
		
		System.out.println("Please apply for a credit card");
		creditCard2=sc.nextLine();
		
		while (!creditCard2.equalsIgnoreCase("Yes")) {
			System.out.println("Please apply for credit card");
			creditCard2=sc.nextLine();
		}
		
		
}
}