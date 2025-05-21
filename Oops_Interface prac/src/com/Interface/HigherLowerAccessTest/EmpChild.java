package com.Interface.HigherLowerAccessTest;

public class EmpChild  extends Employee{

    @Override                                     
	public void m1() { 
    	                                         // we can't change-- "public"-- to other types (access modifiers)
		System.out.println("from child m1");     // we can't give higher access
		                                         // public --> private X , protected X , default X (don't do)  
	}
    protected void m2() {
    	                                         //  private --> can't override "private method"
    }
    @Override
	public void m3() {                           // protected --> public 
		
	}
    @Override
	protected void m4() {                        // default --> public, protected 
		
	}
	
}
