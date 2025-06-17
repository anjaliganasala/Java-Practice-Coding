package com.compare;

import java.util.Comparator;

public class CompanyComaparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.company.compareTo(emp2.company);
	}
	

}
