package com;

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("cat_ mew........mew");
		
	}
	public void sleep() {
		System.out.println("cat is sleeping");
	}
	@Override
	public int noOfLegs() {
		return 4;
	}
	
	

}
