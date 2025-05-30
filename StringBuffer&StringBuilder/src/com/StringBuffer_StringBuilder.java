package com;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Java");
		StringBuilder str1 = new StringBuilder("Program");

//		System.out.println(str.reverse());         //Built-in functions
//		System.out.println(str1.reverse());

		System.out.println(str.append("pro"));

		System.out.println(str.insert(4, ","));

		System.out.println(str.replace(5, 8, "program"));

		System.out.println(str1.length());

		System.out.println(str.capacity());   // initial capacity - 20 , we can not give own
		
		StringBuilder sb = new StringBuilder(300);
		System.out.println(sb.capacity());  // initial capacity - 23 , but we can give own capacity and catch

		String s = str.toString();
		System.out.println(s);
		
		System.out.println(str.delete(0,4));
	}

}
