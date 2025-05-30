package com;

public class MyThread3 implements Runnable {

	@Override
	public void run() {		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread3");
		}
	}

	
}
