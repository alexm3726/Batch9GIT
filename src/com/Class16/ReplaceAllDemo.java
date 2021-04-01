package com.Class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		
		
		String var1="Syntax is best 34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]", ""));
		var1="97456894785jksdbfjsdbkASSKJDBJS";
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));
		var1="95485kakjadfbAKJDNKFNDK@#%%&^&*(";
		System.out.println(var1.replaceAll("[^A-Za-z-0-9]", ""));

	}

}
