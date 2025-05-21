package com.Interface;

public class Test {
	
	int a = 50;
	
	private static Sim sim2;

	public static void main(String[] args) {
		
		VI vi = new VI();
		System.out.println(vi.a);
		System.out.println(vi.Person());
		vi.Number();
		System.out.println(vi.Number());
		System.out.println();
		
		Uninor uninor = new Uninor();
		long adhar = uninor.Adhar();
		System.out.println(uninor.a);
		System.out.println(adhar);
		System.out.println(uninor.Person());
		
		//Parent reference variable holding child objects
		
		Sim sim = new VI();
		System.out.println(sim.Person());
		
		Sim sim2 = new Uninor();
		System.out.println(sim2.Person());
		
		System.out.println(sim2.a);
		
		
	
	
	}

}
