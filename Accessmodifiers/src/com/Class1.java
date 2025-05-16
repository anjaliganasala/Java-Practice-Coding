package com;

public class Class1 {

	public int a = 10;             // access anywhere across our project
	private static int b =5;       // only within the class
	protected int c = 01;          // only same package
	 int d = 25;                   // (default)  within same package 
	 
    public void student() {
    	System.out.println("students.....");
    }
    private void teacher() {
    	System.out.println("teachers......");
    	
    }
    
	public static void main(String[] args) {
		int a = 30;
		Class1 obj = new Class1();
		System.out.println(obj.a);
		obj.student();
		System.out.println(Class1.b);
		obj.teacher();
		System.out.println(obj.c);
		System.out.println(a);
		System.out.println(obj.d);
	
	}
}
