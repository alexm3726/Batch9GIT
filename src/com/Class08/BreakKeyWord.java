package com.Class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		
		boolean rain=true;
		int temp=60;
		
		while (rain) {
			System.out.println("I will stay at home");
			if(temp>75) {
				System.out.println("I will walk under warm rain");
			break;
			//System.out.println("I am code inside loop"); CE:unreachable code
			
			}
			temp+=2;
		}
		
		System.out.println("----------------------------------------");
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Hello");
			
			if (i==5) {
				break;
			}
			System.out.println("I am inside the loop");
		}
	}

}
