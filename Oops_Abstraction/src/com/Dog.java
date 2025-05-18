package com;

public class Dog extends Animal{

	public void sound() {
		
	 System.out.println("dog_bow bow...");

	}
	
	public void sleep() {
		System.out.println("dog sleeping...");
	}

	@Override
	public int noOfLegs() {
		return 4;
	}
	
}
