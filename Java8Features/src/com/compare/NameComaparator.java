package com.compare;

import java.util.Comparator;

public class NameComaparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.empName.compareTo(emp2.empName);
	}
	

}
