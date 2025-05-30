package com;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		Thread.currentThread().setName("--thread");
		String s = Thread.currentThread().getName();
		System.out.println(s);
		for(int i=1 ; i<=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thread1");
		}
	}
	
}
