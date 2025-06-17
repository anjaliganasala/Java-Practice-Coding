package com.Interface;

public class Test {

	public static void main(String[] args) {
		
		Interface2 if2 = new Impl();
		
		if2.sayHi();
	    if2.defaultmethod(); 
	    
	    Interface2.staticmethod();            // staticmethod call with only prent interface-name
	    FunctionalInterfaces.staticmethod();   
	}
}
