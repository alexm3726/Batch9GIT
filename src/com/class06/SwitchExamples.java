package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
		/*
		 * store gender using M or F
		 * based on gender we will specify
		 * if M----> Male
		 * if F-----> Female
		 * otherwise----> not sure
		 * 
		 */
		
		//switch statement is a value based conditional statement
		char gender = 'F';
		String description;
		
		switch(gender) {
		case 'M' :
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
		}
		System.out.println(description);
		
		/*
		 * limitations:
		 * switch CANNOT use relational or logical operators
		 * it simply checks for the equality of value
		 * switch can only be used with int, string, byte, short, char values
		 */
		
		

		
	}

}
