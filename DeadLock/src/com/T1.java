package com;

public class T1 extends Thread{
	
	    T2 t2;
		public void run() {
			try {
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1 ;i<=10;i++) {
			System.out.println("from T1");
		}
	}
		
}


