package com;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());

		Thread10  t10 = new Thread10();
		Thread15 t15 = new Thread15(); // ( Runnable not direct access to start )
		
		t10.start();
		
		Thread t = new Thread(t15);
		t.start();
	}
}
