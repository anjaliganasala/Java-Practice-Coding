package com.Inner;

public class ThreadTest {

	public static void main(String[] args) {

		Runnable t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		
		System.out.println("____________________________________________________");

		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("from Thread2");
			}

		};
		Thread th2 = new Thread(t2);
		th2.start();
		
		System.out.println("_____________________________________________________");
		
		Runnable t3 = () ->  {
			System.out.println(Thread.currentThread().getName());
			System.out.println("from thread3");
		};
		Thread th3 = new Thread(t3);
		th3.start();

	}
}

class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("from Thread1");
	}

}
