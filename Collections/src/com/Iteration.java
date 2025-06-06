package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
public static void main(String[] args) {
	
	Student stu1 = new Student(1,"Anjali");
	Student stu2 = new Student(2,"meena");
	Student stu3 = new Student(3,"vaishu");
	
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(stu1);
	students.add(stu2);
	students.add(stu3);
	
    System.out.println(students);
    
    for(int i=0; i<students.size(); i++) {
    	System.out.println(students.get(i));
    	
    }
    System.out.println("----------------------------------");
    for(Student stu : students) {
    	System.out.println(stu);
    }
    System.out.println("----------------------------------");
    
    //Iterator
    Iterator<Student> iterator = students.iterator();   // line by line printing
    while(iterator.hasNext()) {
    	Student student = iterator.next();
    	System.out.println(student);
    }
    System.out.println("-----------------------------------");
    
    //ListIterator
    ListIterator<Student> listIterator = students.listIterator();
    System.out.println(listIterator.next());
    System.out.println(listIterator.next());
    System.out.println(listIterator.hasPrevious());
    System.out.println(listIterator.previous());
    System.out.println(listIterator.previous());
    System.out.println(listIterator.hasPrevious());
    System.out.println(listIterator.hasNext());
}
}
class Student{
	
	int id;
	String name;
	
	public Student() {
		
	}
	
	public Student(int id , String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
    
}
