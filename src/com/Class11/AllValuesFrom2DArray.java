package com.Class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				{"Alexandria","Oakton","Arlington","Virginia Beach","Fairfax"},
				{"Philly","Strassburg","Pittsburgh"},
				{"Boston","Quincy","Springfield","Burington"},
				{"Los Angeles","Long Beach","San Francisco","Sacramento","Santa Barbara"},
				{"Miami","Orlando","Tampa","Tallahasee"}
		};
		System.out.println(usa.length);//5 total single arrays /5 rows total
		System.out.println(usa[0].length);//5 elements inside array 1/ 5 columns inside row 1
		System.out.println(usa[1].length);//3 elements inside array 2/ 3 columns inside row 2
		System.out.println(usa[2].length);
		
		for(int r=0; r<usa.length; r++) {//iterates over rows
			
			for(int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
			
		}
	}

}
