package com.Class10;

public class arrayIntro {

	public static void main(String[] args) {
		
		
		double[] numbers=new double[2];
		
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		numbers[0]=11.99;
		System.out.println(numbers[0]);
		
		
		//arrays are fixed in size
		
		String[] names=new String[3];
		names[0]="Johanzeb";
		names[1]="Ozoda";
		//names[2]="Alec";
		//names[3]="Yulia"; ArrayIndexOutOfBoundsException
		
		System.out.println(names[2]);
		
		int[] nums=new int[3];//preferred way of array declaration
		//if no values are stored compile adds default  values to the array-->0
		
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		System.out.println(b[2]);
		
		int size=b.length;
		System.out.println("Size of my array is "+size);
		
		
	}

}
