package com.Class12;

public class Task9 {

	public static void main(String[] args) {
		
		
		int[]arr2= {-900,200,3,300,900,45,89,301,76,900,45,125,367,145};
		
		int large, secondLarge;
		
		large=0;
		secondLarge=0;
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>large) {
				secondLarge=large;
				large=arr2[i];
			}else if(arr2[i]>secondLarge && arr2[i]!=large) {
				secondLarge=arr2[i];
			}

	}
		System.out.println("Largest num is "+large);
		System.out.println("2nd largest num is "+secondLarge);

	}
	}
