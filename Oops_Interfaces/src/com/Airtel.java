package com;

public class Airtel implements Trai {

	@Override
	public void calling() {
		System.out.println("calls 1p/1s");
	}

	@Override
	public void data() {
		System.out.println("2G");
	}

	@Override
	public void msg() {
		System.out.println("100 sms");
	}

	@Override
	public void recharge() {
		System.out.println("1Gb at 100rs");
	}

}
