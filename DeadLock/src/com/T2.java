package com;

public class T2 extends  Thread{
	
	T1 t1;
	
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1; i<=10 ; i++) {
		System.out.println("from T2 ");
	}
}
}
