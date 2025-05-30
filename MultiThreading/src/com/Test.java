package com;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("Thread");	
		MyThread1 thread1 = new MyThread1();
//		thread1.run();
		thread1.start();
		
		MyThread2 thread2 = new MyThread2();
		thread2.run();
		thread2.start();

		Runnable thread3 = new MyThread3(); // runnable can not have start method  so we create thread object
		Thread t3 = new Thread(thread3);   //and then pass to that (runnable)reference to that thread object
		     
		t3.start();
		
         Test.sayHi();
         Test.sayBye();
	}

	static void sayHi() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hii");
		}	
	}
	static void sayBye() throws InterruptedException  {
		Thread.sleep(2000);
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("byee");
		}
	}

}
