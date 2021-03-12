package com.class03;

public class TemperatureCheck {
	public static void main(String[] args) {
		
		int temp=29;
		
		if(temp<32) {
			System.out.println("I am a if block");
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("It is very cold");
		}
		else {
			System.out.println("I am else block");
			System.out.println("Water will not freeze with temperature "+ temp);
		}
		
		double money=3;
		double $coke=3;
		
		if (money==$coke) {
			System.out.println("I am buying soda");
			
		}
		else {
			System.out.println("I need exact ammount");
		}
		System.out.println("---------------------------------------");
		
		boolean snow=true;
		
		if (snow) {
			System.out.println("Yay, i will play with the snow");
		}else {
			System.out.println("I am going to ride my bicycle");
		}
		System.out.println("---------------------------------------");
		
		boolean summer=false;
		if(summer) {
			System.out.println("I am going to florida");
		}else {
			System.out.println("I will stay at home");
		}
	}
	
	
	

}
