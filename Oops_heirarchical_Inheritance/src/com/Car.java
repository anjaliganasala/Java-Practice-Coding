package com;

public class Car {
    String colour = "white";
	int speed = 50;
	
	Car(){
		System.out.println("car obj created..");
	}
	void drive() {
		System.out.println(this.colour);
		System.out.println("can drive...");
	}
}
