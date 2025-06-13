package com;

public class Blocks {
	 static int a;
	 static int b;
	 int c;
	
	
	  static {
		  System.out.println("from static__1");   		  // static executes first
           a=10;
           b=20;
           
	  }
	
		public static void main(String[] args) {
			Blocks b = new Blocks();
			
			System.out.println("from main___");
		}
		 public Blocks() {
			 System.out.println("fron constructor");
		 }
		
		static {
			System.out.println("from static___2");      // multiple static blocks are allowed
		}
		{
			System.out.println("from Instance");
			a = 20;
			c = 30;
		}
}


