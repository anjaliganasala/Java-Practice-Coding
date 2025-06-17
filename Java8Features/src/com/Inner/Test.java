package com.Inner;

public class Test {
	public static void main(String[] args) {

		Vehicle bike = new Bike();

		bike.start();
		

		Vehicle lorry = new Vehicle() {
		                                       	// anonymous innerclass - instantly create obj , methods
			@Override
			public void start() {
                 System.out.println("startedd lorry");
			}

			@Override
			public void stop() {
				
			}
		};
		lorry.start();
		lorry.stop();
		lorry.drive();
		
//		Calculator calci = (int a, int b) -> {System.out.println(a+b);};
//    	calci.add(10, 20);  (or)
		
		Calculator calci = (a,b) -> { return a+b;};
		int result = calci.add(1, 2);
		System.out.println(result);
		 
		
	    
	}

}
