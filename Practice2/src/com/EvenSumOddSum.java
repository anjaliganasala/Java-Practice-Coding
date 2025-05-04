package com;

import java.util.Scanner;

public class EvenSumOddSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter a number :");

	    int num = sc.nextInt();
	    
		int evenSum = 0;
		
		int oddSum = 0;
		
		
		for(int i=1; i<=num; i++) {
			
			if(i % 2 == 0) {
				
				evenSum += i;
				
			}else {
				oddSum += i;
			}
		}
		System.out.println("evensum :"+evenSum);
		
		System.out.println("oddSum :"+oddSum);
	}

}
}
