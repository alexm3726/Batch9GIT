package com.Class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		int[] numbers= { 10,14,78,5,90,76,1,8};
		
		for(int i=0; i<numbers.length; i++) {
			
			if (numbers[i]%2==0) {
				System.out.print(numbers[i]+" ");
			}
		}	
			System.out.println();
			System.out.println("------------print in reverse-------------------------");
			
			//print in reverse can only be done with this for loop not enhanced
			
			for(int i=numbers.length-1;i>=0; i--) {
				
				System.out.print(numbers[i]+" ");
			}
		}

	}


