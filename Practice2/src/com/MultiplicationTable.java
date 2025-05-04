package com;

import java.util.Scanner;

public class MultiplicationTable {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	while(true){
	System.out.println("Enter a number :");
	
	int num = scan.nextInt();

	if(num == 0) {
		break;
	}
	
	
	for(int i=1; i<= 20 ; i++) {
	
		
		System.out.println(num + " X" + i + " = " + (num * i));
	}
}
}
}
