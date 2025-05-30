package com;

public class MainThread {
		public static void main(String[] args) throws InterruptedException {
			
			Counter counter = new Counter();

			Thread1 t1 = new Thread1(counter);
			Thread2 t2 = new Thread2(counter);
			
			t1.start();
			t2.start();
			Thread.sleep(2000);
			t1.join();
			t2.join();
			System.out.println("counter value : "+ counter.count);
			
		}
	}
	class Thread1 extends Thread{
		
		 Counter counter;
		 
		 public Thread1(Counter counter) {
			 this.counter = counter;
		 }
		@Override
		public void run() {
			
			for(int i=1; i<=1000; i++) {
			counter.increment();
		}
	}
	}
	class Thread2 extends Thread{
		 Counter counter;
		 public Thread2(Counter counter) {
			 this.counter = counter;
		 }
		@Override
		public void run() {
			for(int i=1;i<=1000;i++) {
				counter.increment();
			}
		}
}


