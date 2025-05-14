package com;

public class EvCar extends Car{
   int charge = 200;
   String colour = "Red";
	void charge() {
		System.out.println(super.colour);
		System.out.println(this.colour);
		System.out.println(this.charge);
		System.out.println("charged...");
	}
}
