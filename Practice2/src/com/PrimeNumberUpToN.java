package com;

import java.util.Scanner;

public class PrimeNumberUpToN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int num = sc.nextInt();
		
		System.out.println("prime between 1 and "+num+"are:");
		
		for(int i=2; i <=num ; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
				
			}
		}
		
	}
	public static boolean isPrime(int num) {
		if(num <2)
			return false;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
