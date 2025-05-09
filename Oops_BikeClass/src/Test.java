
public class Test {
public static void main(String[] args) {
	
	Bike myBike = new Bike();
	Bike newBike = new Bike("RED");
	myBike.colour = "Black";
	myBike.gear = 0;
	myBike.speed = 0;
	myBike.brake = 10;
	myBike.petrolCapacity = 120;
	
	System.out.println("new bike :"+newBike.colour);
	System.out.println("myBike colour :"+myBike.colour);
	System.out.println("myBike gear :"+myBike.gear);
	System.out.println("myBike speed :"+myBike.speed);
	
	myBike.increaseSpeed();
	System.out.println(myBike.gear);
	
	myBike.petrolCapacity();
	System.out.println(myBike.petrolCapacity);
	
	
}
}
