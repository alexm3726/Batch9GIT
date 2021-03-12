package com.class06;

public class switchDemo {

	public static void main(String[] args) {
		
		int day = 3;
		String weekday;
		
		if (day == 1) {//works with conditions and evaluates if condition is true or false
			weekday="Monday";
		} else if (day == 2) {
			weekday="Tuesday";
		} else if (day == 3) {
			weekday="Wednesday";
		} else if (day == 4) {
			weekday="Thursday";
		} else if (day == 5) {
			weekday="Friday";
		} else if (day == 6) {
			weekday="Saturday";
		} else if (day == 7) {
			weekday="Sunday";
		} else {
			weekday="Invalid";
		}
		
		if (!weekday.equals("Invalid")) {
		System.out.println("Today is "+weekday);
		}
		
		System.out.println("-------------using switch-----------");
		
		String weekday1;
		switch(day) {//value based will jump right away to matching case
		
		//we cannot have duplicate cases
		// values Must match a variable type
		//we Must have break in every case
		
		case 1:
			weekday1 = "Monday";
			break;
		case 2:
			weekday1 = "Tuesday";
			break;
		case 3:
			weekday1 = "Wednesday";
			break;
		case 4:
			weekday1 = "Thursday";
			break;
		case 5:
			weekday1 = "Friday";
			break;
		case 6:
			weekday1 = "Saturday";
			break;
		case 7:
			weekday1 = "Sunday";
			break;
		default:
			weekday1 = "Invalid";
			break;
						
		}
		System.out.println(weekday1);
		
		if (!weekday1.equals("Invalid")) {
			System.out.println("Today is "+weekday1);
		}
		

	}

}
