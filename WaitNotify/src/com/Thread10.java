package com;

public class Thread10 extends Thread {
 
	@Override
	public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("T10");
	}
	}
}
