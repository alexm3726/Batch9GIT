package com.Class12;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * 
		 * Max and min number in the array
		 */
		int[] largeArray = { 158698, 564, 7894, 10, 50, 0 };
		int smallest=largeArray[0];
		int largest=largeArray[0];
		
		for(int i=1; i<largeArray.length; i++) {
			if(largeArray[i]<smallest) {
				smallest=largeArray[i];
			}
			if(largeArray[i]>largest){
				largest=largeArray[i];
			}
		}
		
		System.out.println(smallest+" is minimum number in the array");
		System.out.println(largest+" is maximum number in the array");
	}

}
