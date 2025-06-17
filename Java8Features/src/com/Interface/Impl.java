package com.Interface;

public class Impl implements  FunctionalInterfaces,Interface2 {

	@Override
	public void sayHi() {
		Interface2.super.sayHi();
	}

	@Override
	public void defaultmethod() {
		System.out.println("imple defaultmethod");
	}

	@Override
	public void sayBye() {
		
	}

	@Override
	public void Hi() {
		
	}


}


