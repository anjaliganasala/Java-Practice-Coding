package com;

class Potato{
	String s = "veg";
void tastePotato() {
	System.out.println("Potato curry ...served");
}
}

class Tomato extends Potato{
	String s = "veg";
void tasteTomato() {
	System.out.println("Tomato curry...served");
}
}

class Chiken extends Tomato{
	String s = "nonveg";
void tasteChiken() {
	System.out.println("Chiken curry...served");

}
}

public class Multi_Level_Inheritance{
	
	public static void main(String[] args) {
		Potato p = new Potato();
		Tomato t = new Tomato();
		Chiken c = new Chiken();
		
		System.out.println(p.s);
		System.out.println(t.s);
		System.out.println(c.s);
		
		p.tastePotato();
		t.tasteTomato();
		c.tasteChiken();
		t.tastePotato();
		c.tastePotato();
		c.tasteTomato();
		
	}
}