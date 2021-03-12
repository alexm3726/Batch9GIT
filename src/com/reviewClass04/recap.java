package com.reviewClass04;

public class recap {
	
	public static void main(String[] args) {
		
		int i=0;
		System.out.println("int i=10; \n"+i);
		i=i+20;
		System.out.println("int i=10; \n"+i);
		i+=10;
		System.out.println("int i=10 \n"+i);
		i++;
		System.out.println("int i=10; \n"+i);
		++i;
		System.out.println("int i=10; \n"+i);
		
		i=10;
		System.out.println("int i=10; \n"+(++i));// first increment the value then use it
		System.out.println("int i=10; \n"+(i++));// first use the value then increment
		System.out.println("i "+i);//in the next line updated value will reflect in i
		

		}

}
