package com;

public class AllTypes {
public static void main(String[] args) {
	
	char c = 'A';
	Character ch = c;
	System.out.println(c);
	System.out.println(ch.getClass());    // type ni chuskovadanki
	
	
	Character c2 = 'B';
	char cha = c2;
	
	System.out.println(c2);
	System.out.println(c2.getClass());
	
	char c3 = 'C';
	Character cc = Character.valueOf(c3);
	System.out.println(c3);
	
	float f = 10f;
	Float F = f;                    // assigning
	System.out.println(f);        
	
	float f2 = 3.14f;
	Float f1 = Float.valueOf(f2);  // type.valuOf()
	System.out.println(f2);
	
	Double d = 20.0;
	double d1 = d;
	System.out.println(d);
	
	boolean flag = false;
	Boolean B =flag;           // assigning
	System.out.println(flag);  // auto boxing
	
	boolean B1 = flag;
	System.out.println(flag);  // auto unboxing
	
	boolean boo = true;
	Boolean bo = boo;          
	Boolean booo= Boolean.valueOf(boo);
	System.out.println(boo);
	
	String num1 = "123";                 // if string as number we can convert like this(int,float,double)
	int number = Integer.parseInt(num1);
	System.out.println(number+1);
	
	int num2 = 12345;
	String string = String.valueOf(num2);
	System.out.println(string + 6);
	
	
 }
	
}
