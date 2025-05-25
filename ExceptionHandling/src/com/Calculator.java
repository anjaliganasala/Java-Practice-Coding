package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter number 1 :");
			int num1 = sc.nextInt();

			System.out.println("enter number 2 :");
			int num2 = sc.nextInt();

			int num3 = num1 / num2;
			System.out.println("after division :" + num3);

		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		 try {
			                  // we can write multiple try catch in try 
		 }
          catch(Exception e) {
        	  
          }
	    finally
	    {
	    	try {
	    		
	    	}
	    	catch(Exception e) {
	   		
	    	}
	    	System.out.println("finally enterd ..");
			sc.close();
		}
        System.out.println("task completed!!");
	}

}
