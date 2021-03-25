package com.Class14;

public class Student {
	
	char getGrade(double a) {
		
		if(a>=90) {
			return 'A';
		}else if(a>=80 && a<90) {
			return 'B';
		}else if(a>=70 && a<80) {
			return 'C';
		}else if(a>=50 && a<70) {
			return'D';
		}else {
			return 'F';
		}
		
	}

	public static void main(String[] args) {
		
		Student studentClassA1=new Student();
		System.out.println(studentClassA1.getGrade(99.9));

	}

}
