package com;

public class Implicit {
    public static void main(String[] args) {
		byte b = 127;
		short s = b;
	    s = 1200;
		int i = s;
		long l = i;
		float f = 12.345f;
		double d = f;
		System.out.println("Byte :"+b);
		System.out.println("short :"+s);
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);
	}
}
