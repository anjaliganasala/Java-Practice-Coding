package com;

public class Test {
public static void main(String[] args) {
    
	Car c = new Car();
	c.drive();
	 
	EvCar e = new EvCar();
	e.charge();
	
	FuelCar f = new FuelCar();
	f.fuel();	
}
}
