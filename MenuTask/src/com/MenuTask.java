package com;

import java.util.Scanner;

public class MenuTask {
	
	public static void main(String[] args) {
		System.out.println("chicken");
		System.out.println("panner");
		System.out.println("biryani");

		
	Scanner sc = new Scanner(System.in);

	
	System.out.println("Enter your menu :");
	
	int menu = sc.nextInt();

	switch(menu) {
	
	case 1 : 
		System.out.println("your order is placed successfully!!");
		break;
		
	case 2 : 
		System.out.println("panner is placed successfully!!!");
		break;
		
	case 3 :
		System.out.println("Biryani is placed successfully!!");
		break;
	default :
		System.out.println("Not placed order ................yet");

	}
	}

}

