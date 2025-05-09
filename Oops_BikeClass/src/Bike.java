
public class Bike {
 String colour;
 int gear;
 int speed;
 int brake;
 double petrolCapacity;
  
 Bike(){
	 System.out.println("object is created by constructor..");
 }
 Bike(String newcolour){
	 colour = newcolour;
 }
 
 void increaseSpeed() {
	 gear+=5;
 }
 void accelerate() {
	 speed+=10;
 }
 void brake() {
	 brake-=10;
 }
 void petrolCapacity() {
	 petrolCapacity +=1;
	 
 }
}