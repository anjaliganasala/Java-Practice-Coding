package com;

public class Animals {
	
public static void main(String[] args) {
	ParentAnimal p = new ParentAnimal();
	ChildAnimal ch = new ChildAnimal();
	System.out.println(p.s1);
	System.out.println(p.s2);
	System.out.println(ch.s3);
	System.out.println(ch.s4);
	System.out.println(ch.s1);
	System.out.println(ch.s2);	
	System.out.println(p.s1);
	System.out.println(p.s2);
	p.barkingParent();
	ch.barkingChild();
	ch.barkingParent();
}
}
