package com;

public class Test {
	

	int num3;
	
	Integer num4;

	public static void main(String[] args) {
		
		int a=10;
		Integer b=50;

		Integer num = new Integer(20);    //deprecated in java 9 
		
		//Autoboxing (int -> Integer)
		
	    Integer integer = Integer.valueOf(a);     // upto java -5 used this method - (boxing)
	    Integer e = a;                            // jvm - calls (auto- boxing)
	    System.out.println(e);
	    
	    //Autounboxing (Integer ->int)
	    
	    int d = b.intValue();
	    int f = b;
	    System.out.println(f);
	    
	    String s = "2000";
	    
	    int number = Integer.parseInt(s);    // if need integer convertion(Integr.parseInt())
	    
	    System.out.println(s+2);
	    System.out.println(number+2);
	    
	    String numString = String.valueOf(number);  // if need String convertion
	    System.out.println(numString);
	    
	    int num2;  // local variables doesn't have values (not a zero also))
	    
	    Test test = new Test();
	    System.out.println(test.num3);
	    System.out.println(test.num4);
	    
	    float f1 = 3.14f;
	    Float F = f1;
	    System.out.println(f1);
	}

}
