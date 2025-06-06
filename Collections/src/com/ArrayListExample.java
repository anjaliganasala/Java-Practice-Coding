package com;

import java.util.ArrayList;

public class ArrayListExample
{

public static void main(String[] args) {
	
	ArrayList list = new ArrayList(); // without gererics - for printing hetrogeneous values
	list.add(10);
	list.add('a');
	list.add("anju");
	list.add(2.4);
	list.add(new Employee("anj", "22"));
	list.add(0, 20);                    // reshuffled values if we try to change
	list.set(0, "ANJU");                // set - replace
	list.remove(0);                      // index value
    list.remove("anju");                 // remove value directly
    list.add(true);
    
    
    ArrayList list2 = new  ArrayList(); // list2 is copied by list
    list2.addAll(list);
    System.out.println(list2);
   
	System.out.println(list); 
	System.out.println(list.get(2));
	System.out.println(list.size());
	System.out.println(list.indexOf('a'));
	System.out.println(list.lastIndexOf('a'));
	System.out.println(list.isEmpty());
	System.out.println(list.contains('a'));
	list.clear();
	System.out.println(list);
	System.out.println(list.size());
	
	
	ArrayList<Integer> numbers = new ArrayList<Integer>(); // with generics
	numbers.add(10);
	numbers.add(11);
	System.out.println(numbers);
	
	ArrayList<String> Employee = new ArrayList<String>();
	Employee.add("anjali");
	Employee.add("divya");
	Employee.add("sai");
	Employee.add(null);                                       // ArrayList accepts more than one Nulls
	Employee.add(null);
	
	System.out.println(Employee +" "+ numbers);
	
	ArrayList<Employee> employee = new ArrayList<Employee>(); //Employee type ArrayList
	employee.add(new Employee("peter", "22"));                // created employee object
    employee.add(new Employee("john", "23"));
	System.out.println(employee);
	System.out.println(employee.get(0));
}
}
class Employee{
	String name;
	String age;
	public Employee(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee { Name = " + name + " , age = " + age + " } ";
	}	
}
