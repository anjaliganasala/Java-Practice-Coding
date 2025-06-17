package com.lambda;

public class Test {
	public static void main(String[] args) {
			 
	 Vehicle car1 = () -> {
		 for(int i=0;i<=5;i++) {
			 System.out.println(i);
			 System.out.println("start"+i);
		 }
		 System.out.println("started car");   // lambda expression () -> {};
	 }; 
	 car1.start();
}
}

