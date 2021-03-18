package com.Class13;

public class DogClass {
	
	public String size;
	public String color;
	public String breed;
	public double age;
	public void bark() {
		
		System.out.println("ruff ruff and wow wow wow");
	}
	public void sleep() {
		System.out.println("ZZZZZZZZZZZZzzzzz...");
	}
	public void eat() {
		System.out.println("Omnomnomn");
	}
	public void look() {
		System.out.println("Hi I am a dog my color is " +color);
	}
	
	public static void main(String[] args) {
		
		DogClass bullDog=new DogClass();
		bullDog.breed="American Bulldog";
		bullDog.size="Large";
		bullDog.color="Pink";
		bullDog.age=5;
		bullDog.bark();
		bullDog.eat();
		bullDog.sleep();
		bullDog.look();
		
		DogClass beagle=new DogClass();
		beagle.breed="Beagle";
		beagle.size="Large";
		beagle.color="Orange";
		beagle.age=6;
		
		DogClass germanShepherd=new DogClass();
		germanShepherd.breed="German Shepherd";
		germanShepherd.size="Large";
		germanShepherd.color="White and Orange";
		germanShepherd.age=6;
		
		DogClass beagle2=new DogClass();
		beagle2.age=8;
		beagle2.breed="Beagle";
		beagle2.size="Large";
		beagle2.color="light grey";
		beagle2.look();
		
	}

}
