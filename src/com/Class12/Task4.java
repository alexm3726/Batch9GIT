package com.Class12;

public class Task4 {

	public static void main(String[] args) {
		
		String[][] Countries = {
				{ "USA", "Canada", "Mexico" }, 
				{ "Brazil”, “Colombia”, “Peru”, “Bolivia”, “Argentina" },
				{ "France”, “Spain”, “Italy”, “UK”, “Germany”, “Sweden" }, 
				{ "UEA”, “Sudi”, “Palestine”, “Syria" },
				{ "Algeria”, “Morocco”, “Senegal”, “Lybia", "Tunisia", "Sudan", "Malawi", "South Africa" }, 
				};
		for (String[] country : Countries) {
			for (String c : country) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		int sum=0;
		for (int i = 0; i < Countries.length; i++) {
			for (int j = 0; j < Countries[i].length; j++) {
				System.out.print(Countries[i][j] +" ");
			}
			System.out.println();
			sum+=Countries[i].length;
			System.out.println("The Total of the counties stored is:" + sum);
		}
		System.out.println();
		
	}

	}

