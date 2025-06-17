package com.Interface;

public interface Interface2 extends FunctionalInterfaces {


	public void sayBye();
	
	@Override
	default void sayHi() {
		FunctionalInterfaces.super.sayHi();
	}

	@Override
	default void defaultmethod() {
		System.out.println("from interface2-defaultmethod");
	}

   static void staticmethod() {
	   System.out.println("static method");
   }
}
