package com.reviewClass04;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			
			for(int j=0;i<5; j++) {
				System.out.println(i+" "+j);
				/*
				 * never incremented value of i inside the nested for loop so we
				 * never left the second loop
				 */
				//i++;
				
			}
		}
	}

}
