package com;

public class VarargsExample {
	
	public static void main(String[] args) {
		
	  VarargsExample.Print("first set:","primary" ,'A' ,1,2);
      Print("second set: ","primary",'B',3,4);
      Print("Third set :","secondary",'A',7,8,9,10);
      
      
	}
	
	public static  void Print(String label, String clas, Character sec, int... numbers ) {   // static method
		 
		System.out.println(label);
		System.out.println(clas);
		System.out.println(sec +"-section");
		
		for(int num : numbers) {
			
			System.out.println(num);
			
		}
	}
}
