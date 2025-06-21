package com.Stream;

public class Employee {

	int id;
	String name;
	int salary;
	 
	public Employee() {
		
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name=name;
		this.salary = salary;
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}


