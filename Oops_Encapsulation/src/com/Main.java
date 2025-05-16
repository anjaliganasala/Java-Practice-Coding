package com;

public class Main{
	
    public static void main(String[] args) {
    	
    	BankAccount account = new BankAccount("anjali",5000);
    	
    	System.out.println(" Welcome "+account.getAccHolder());
    	
    	System.out.println("Initial Balance :"+account.getBalance());
    	account.deposit(2000);
    	account.withdraw(1000);
    	account.withdraw(50000);
    	System.out.println("current balance :"+account.getBalance());
}
    
}
