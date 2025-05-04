package com;

import java.util.Scanner;

public class FlowUntilZero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a number :"); 
      
      int sum = 0;
      
		while(true){
			
		int num = sc.nextInt();
		
		if(num == 0) {
			
			break;
		}
		sum +=num;
		
	}
		System.out.println("Result :" + sum);

}
}
