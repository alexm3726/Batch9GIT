package com.Class14;

public class endTask {


		
		/*
		 * Create a method that will say Hello in
		 * different language based on the country 
		 * that will be passed when method is executed
		 */
		
		String greet(String country) {
			
			if(country.equalsIgnoreCase("El Salvador")) {
				return "Hola";
			}else if(country.equalsIgnoreCase("France")) {
				return "Bonjour";
			}else {
				return "I do not know this language";
			}
			
			
		}
		
		
		/*
		 * Write a method to return whether given number is prime or not?
		 */
		
		String primeOrNot(int a) {
			
			if(a==1 && a>1) {
				return "Not Prime";
			}else if(a==2 && a>1) {
				return "Prime";
			}else if(a>1 && a%2!=0 && a%a==0) {
				return "Prime";
			}else {
				return"Not Prime";
			}
			
			
		}
		
		public static void main(String[] args) {
			
			endTask endTask=new endTask();
			System.out.println(endTask.greet("El salvador"));
			System.out.println(endTask.greet("FRANCE"));
			System.out.println("----------------------------------------");
			
			
			System.out.println(endTask.primeOrNot(3));
		}


}
