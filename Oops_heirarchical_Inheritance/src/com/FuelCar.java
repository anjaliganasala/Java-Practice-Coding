package com;

public class FuelCar  extends Car{

	int fuelcharge = 100;
    int fuelCapacity;

public FuelCar(){                         // if we create fuelcar obj automatically jvm created obj for
	this(1000);
	                                      // parentclass(Car) , because of extended.. (extends)
	System.out.println("fuelCar obj created..");
}
FuelCar(int fuel){
	this("blue");
	this.fuelCapacity = fuel;
	System.out.println(fuelCapacity);
	System.out.println(colour);
}
FuelCar(String colour){
	this.colour = colour;
}

void fuel(){
	System.out.println(fuelcharge);
	System.out.println("filled fuel..");
}
}
