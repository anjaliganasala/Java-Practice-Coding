package com;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address addr = new Address("12345");
		Employee emp = new Employee(1,"anjali",addr);
		
		System.out.println(emp);
		
		Object emp2 = emp.clone();           // duplicate - clone()
		System.out.println(emp2);
		
		emp.name = "Anju";
		emp.address.pincode = "98765";
		System.out.println(emp);
		
		System.out.println(emp2);
	}

}
