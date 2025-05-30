package com;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(Math.abs(-10));
		
		System.out.println(Math.max(100,11));
		
		System.out.println(Math.min(10,90));
		
		System.out.println(Math.round(5.5));
		
		System.out.println(Math.ceil(5.1));
		
		System.out.println(Math.floor(5.9));
		
		System.out.println(Math.pow(2, 2));
		
		System.out.println(Math.sqrt(25));
		
		System.out.println(Math.cbrt(125));
		
		System.out.println(Math.random());  // 0.0 - 0.1
		
		Random random = new Random();
		System.out.println(random.nextInt(10000,999999));   // 6 digit otp
		System.out.println(random.nextInt(1000,99999));     // 4 digit otp
	}

}
