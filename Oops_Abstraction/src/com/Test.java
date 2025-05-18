package com;

public class Test {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();
		cat.sleep();
		System.out.println(cat.noOfLegs());

		
		Dog dog = new Dog();
		dog.sound();
		dog.sleep();
	    System.out.println(dog.noOfLegs());
		
	}
}
