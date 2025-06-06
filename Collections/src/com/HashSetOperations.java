package com;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HashSetOperations {

	public static void main(String[] args) {

		Set<Study> student = new HashSet<Study>();
        Study st = new Study(2 , "sai");
		Study st1 = new Study(1, "Anju");
		Study st2 = new Study(1, "Anju");

		student.add(st1);
		student.add(st2);
		
		System.out.println(student);
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());

	}
}

class Study {

	int id;
	String name;

	public Study() {

	}

	public Study(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Study other = (Study) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	

}
