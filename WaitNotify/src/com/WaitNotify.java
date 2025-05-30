package com;

public class WaitNotify {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getPriority());

		Thread5 t5 = new Thread5(); // New

		t5.start(); // Runnable
//    	Thread.sleep(1);  // blocked (main thread) // 1000 - 1 sec (hold) main thread
//		t5.join();     //  main should stop until t5 running

		synchronized (t5) {
			t5.wait(); // wait (main)Thread until notify
		}

		System.out.println(t5.count); // main thread can not wait for t5

	}

}

class Thread5 extends Thread {
	int count = 0;

	@Override
	public void run() {
		Thread.currentThread().setName("Thread5");
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			for (int i = 1; i <= 50000; i++) { // Running
				count++;
			}
			this.notify();
			for (int i = 1; i <= 50000; i++) { 
				count++;
			}
			for (int i = 1; i <= 50000; i++) { 
				count++;
			}
			
		}
	}
}