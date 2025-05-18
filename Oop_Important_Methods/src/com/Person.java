package com;

import java.util.Objects;

public class Person {
 
	int age = 10;            // declaration with initialization
	String name = "Anjali";
	
	Person(){
		
	}
	
	public Person(int age, String name) {
		super();                         //initialization with constructor
		this.age = age; 
		this.name = name;
	}


	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age =  20;                    // initialization with objects
		p1.name = "bhagi";
	 
	Person p2 = new Person(30,"sita");	          //(constructor -parameters pass arguments)
    
	Person p3 = new Person();
	p3.setAge(30);                     // initialize values with getter and setter
	p3.setName("sita"); 
    
		boolean isSame = p1.equals(p2);
		System.out.println(isSame);        // euals()  - override
		
		boolean isSame2 = p2.equals(p3);
		System.out.println(isSame2);
		
		System.out.println(p1.hashCode()); // hashcode() - override
		System.out.println(p2.hashCode());   
		System.out.println(p3.hashCode());
		
		System.out.println(p1);            //toString() -override
		System.out.println(p2);
		System.out.println(p3);
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object object) {
		Person person = (Person) object;
		return age == person.age && name.equals(person.name);
	}
	

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
