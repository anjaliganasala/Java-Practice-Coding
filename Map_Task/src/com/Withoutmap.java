package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Withoutmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of characters :");
		int n = sc.nextInt();
		char[] arr = new char[n];
		
		System.out.println("enter characters : ");
		for(int i=0;i<n;i++) {
			 arr[i] = sc.next().charAt(0);
		}
		int[] ascii = new int[256];
	
		for(int i=0; i<n;i++) {
			ascii[arr[i]]++;		
		}
		
		for(int i=0; i<256; i++) {
			if(ascii[i]>0) {
				System.out.println((char)i+ "-" +ascii[i]);
			}
		}
	    
	}
}
