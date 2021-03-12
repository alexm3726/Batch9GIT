package com.Class10;

public class Task01 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * create an array of chars
		 * and store grades into it : A-F
		 * then print a grade B
		 */
		
		char[] grade;
		grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		System.out.println("-------------------------Another way of creating an Array-----------------");
		
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		
		System.out.println(grades[6]);
		System.out.println("Number of elements in 2nd array "+grades.length);
		
		
		//char[] grades1;
		//grades1={};------> won't work
		
		

	}

}
