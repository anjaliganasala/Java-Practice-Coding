package com.Interface;

public interface FunctionalInterfaces {

	void Hi();           // functional interface only one abstract method

	default void sayHi() {
		System.out.println("Hiiii. from functionalIntefaces");
	}

	default void defaultmethod() {
		System.out.println("From - functionalIntefaces-defaultmethod");
	}

	static void staticmethod() {
      System.out.println("hhhhhhhhhhhhh");		
	}
	
}
