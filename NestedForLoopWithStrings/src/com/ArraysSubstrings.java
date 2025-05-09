package com;

import java.util.Scanner;

public class ArraysSubstrings {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string:");
	String str = sc.nextLine();
	
	for(int i=0; i<= str.length()-1; i++) {
		
		for(int j=i+1; j<=str.length(); j++) {
			
			String substr = str.substring(i,j);
			
			System.out.println(substr);
		}
	}
}
}
