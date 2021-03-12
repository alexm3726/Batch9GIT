package com.Class11;

public class Task2 {

	public static void main(String[] args) {
		
		String[][] names= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith","Jordan","Jackson","Obama"}
		};
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		
		String[][] students= {
				{"Alex","Dude","Peter","Pan"},
				{"A","B","C","D"}
				
		};
		System.out.println(students[0][1]+" "+students[1][0]);
	}

}
