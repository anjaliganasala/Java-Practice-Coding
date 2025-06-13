package com;

public class Calculator {

	public static void main(String... args) {           // we can also write varargs her..
		
		Calculator cal = new Calculator();
		
		cal.sum(10, 20);
		cal.sum(10,20,30);
		cal.sum(10,20,30,40);
		
	}

//	public void sum(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	public void sum(int a , int b , int c) {
//		System.out.println(a+b+c);
//	}
//	public void sum(int a, int b, int c ,int d) {
//		System.out.println(a+b+c+d);
//	}
	
	public void sum(int... in) {          // variable arguments
		                                     //  Rules: 1. Only one vararg is allowed per method.
		int sum = 0;                         //         2. It must be the last parameter:
		for(int add : in) {
			sum += add;
		}
		System.out.println(sum);
	}
}