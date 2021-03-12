package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//first way to create a variable
		
		short b=200; //created variable and assigned value
					 //declared a variable and initialized	
		
		//second way to create a variable
		int sum; //declaration of the variable
		sum=20;  // initialized the variable
		
		sum=30; //reassigning the variable
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 * 
		 */
		
		int x,y,z,w,q; // all 3 variables were declared for int data type
		
		
		x=10;
		y=20;
		//z=30.9; error: type mismatch: since variable was declared for int only
		
		
		// I would like to change the value of x
		x=70;
		System.out.println(x);
		
		// we are using the value of a variable to initialize different variable
		
		int num=33;
		int num2=num;
		
		System.out.println(num2);
		

	}

}
