package com;

import java.util.Scanner;

public class SumOfMultiples {
	
  public static void main(String[] args) {
	  
	 Scanner sc = new Scanner(System.in);
	 
	 while(true) {
	 System.out.println("Enter number :");
	
	 int num = sc.nextInt();
	 
	 if(num == 0) {
		 break;
	 }
	 
	int sum = 0 ;
	
	for(int i=1 ; i<=num ; i++){
		
		if(i % 3 == 0 || i % 5 == 0) {
			
			sum +=i;
		}
		
	}
	System.out.println("Output :"+sum);
}
}
}
