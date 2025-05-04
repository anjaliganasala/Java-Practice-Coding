package com;

public class Explicit {
public static void main(String[] args) {
	short s = 100;
	char a = (char) s;
	long l = (long) s;
	int i = (int) l;
	long num = 'A';
	System.out.println(num);
	System.out.println(a);
	int j = (int) 15.666f;
	System.out.println(j);
	int character = 'Z';
	System.out.println(character);
	
}
}
