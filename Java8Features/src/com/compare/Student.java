package com.compare;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	
	public Student() {
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id =" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student student) {
		//+ve -ve zero
		//return (this.id == student.id) ? 0 : (this.id > student.id) ? 1 : -1;  // reverse -1 and i for descending order
	
		return this.name.compareTo(student.name);     // only one comparinsion at a time
	}


}
