package com;

public interface Test {

	public static void main(String[] args) {
		
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		airtel.msg();
		airtel.recharge();
		
		System.out.println();
		
		Jio jio = new Jio();
		jio.calling();
		jio.data();
		jio.msg();
		jio.recharge();
	}
}
