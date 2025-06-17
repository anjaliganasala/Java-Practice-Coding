package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test {

	private static final String Comaparator = null;

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Anjali"));
		students.add(new Student(2, "Bhagi"));
		students.add(new Student(0,"vaishu"));
		
		System.out.println(students);
		
		Collections.sort(students);   // sort here
		
		System.out.println(students);  // print here
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "java", "Anjali"));
		employees.add(new Employee(3,"C", "sai"));
		employees.add(new Employee(2, "python", "Bhagi"));
		System.out.println(employees);
		
		Collections.sort(employees , new IdComaparator());
		System.out.println(employees);
		
		Collections.sort(employees, new NameComaparator());
		System.out.println(employees);
		
		Collections.sort(employees, new CompanyComaparator());
		System.out.println(employees);
		
		Comparator<Employee> CompanyComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.company.compareTo(emp2.company);
				
			}
		};
		Collections.sort(employees , CompanyComparator);
		System.out.println(employees);
		
		Comparator<Employee> idComparator = (e1 , e2) ->{ return Integer.compare(e1.empId, e2.empId);};
		Collections.sort(employees,idComparator);
		System.out.println(employees);
		
		System.out.println("_____________________________________");
		Collections.sort(employees, (e1,e2)-> e1.company.compareTo(e2.company));
		System.out.println(employees);
		
		Collections.sort(employees, (e1, e2)-> e1.empName.compareTo(e2.empName));
		System.out.println(employees);
		
//		TreeSet<Employee> empSet = new TreeSet<Employee>(idComparator);
//		empSet.add(new Employee(1, "Anju","xx"));
//		empSet.add(new Employee(2,"bharu", "yy"));
//		System.out.println(empSet);
		TreeSet<Employee> empSet = new TreeSet<Employee>((e1,e2)->e1.empName.compareTo(e2.empName));
		empSet.add(new Employee(1, "Anju","xx"));
		empSet.add(new Employee(2,"bharu", "yy"));
		System.out.println(empSet);
	}
}
