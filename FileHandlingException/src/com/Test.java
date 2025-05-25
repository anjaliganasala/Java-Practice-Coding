package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc;
			System.out.println("enter age:");
			sc = new Scanner(System.in);
			int age=sc.nextInt();
			if(age>18) {
				System.out.println("can vote");
			}
			else {
				throw new InvalidAgeException("your not eligible for vote");
			}

		System.out.println("bye");	
}
}
