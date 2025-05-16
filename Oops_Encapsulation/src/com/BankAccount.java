package com;
public class BankAccount {
	private String accHolder;
	private double balance;
	
	public  BankAccount(String name, double initialBalance) {
		    this.accHolder = name;
		if(initialBalance >=0) {	
			this.balance = initialBalance;
		}
		else {
			balance = 0;
		}
	  }
	
	public void deposit(double amount) {
		if(amount>=0) {
			balance += amount;
			System.out.println("Deposite rupees : "+amount);
		}
		else {
			System.out.println("Invalid deposite amount");
		}
	}

	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			
			balance -=amount;
			System.out.println("withdraw rupees : "+amount);
		}
		else {
			System.out.println("Insufficient balance!!!");
		}
	}

	public double getBalance() {
		return balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
}
 
