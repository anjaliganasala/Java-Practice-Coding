package com.compare;

import java.util.Comparator;

public class IdComaparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return Integer.compare(emp1.empId,emp2.empId);
	}

}
