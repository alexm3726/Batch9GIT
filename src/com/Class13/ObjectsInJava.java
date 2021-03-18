package com.Class13;



public class ObjectsInJava {

	public static void main(String[] args) {
		
		/*
		 * we will be learning  how to write a large amount of java
		 * code to make things easier
		 * 1. Managing the code
		 * 2. Changing the code
		 * Using programming to solve real life issues more easily 
		 * OOP(Object Oriented Programming)
		 * OOP is away of writing the code using the idea of objects
		 * objects- everything that you can see and touch around you
		 * its impossible to write any java program without these classes and object
		 * Class is design/template/blueprint that has attributes (which will describe how the object
		 * that will be created using that class will look like) and 
		 * methods/behavior (how the object will look like)
		 * 
		 */
		
		MobilePhone iPhone=new MobilePhone();
		iPhone.model="iPhone 12";
		iPhone.price=1200;
		iPhone.size=6.4;
		iPhone.make="Apple";
		iPhone.color="Black";
		
		
		MobilePhone samsungS21=new MobilePhone();
		samsungS21.model="S21";
		samsungS21.price=800;
		samsungS21.size=6.8;
		samsungS21.make="Samsung";
		samsungS21.color="Phantom Black";
		
		MobilePhone nokia=new MobilePhone();
		samsungS21.model="8.3";
		samsungS21.price=599.99;
		samsungS21.size=6.7;
		samsungS21.make="Nokia";
		samsungS21.color="Polar Night";
		
		

	}

}
