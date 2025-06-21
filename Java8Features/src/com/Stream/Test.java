package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5, 10 , 20,10));
		//for
		//for each
	    // iterator / list iterator
		
		nums.forEach ((n) -> System.out.println(n));
		 
		List<Integer> even = nums           // List
		     .stream()
		     .filter((n) -> n%2 == 0)                       
		     //.forEach((n)-> System.out.println(n));
		     .collect(Collectors.toList());                    
		System.out.println(even);
		
		Set<Integer> evens = nums              // Set - no duplicates , no order
			     .stream()
			     .filter((n) -> n%2 == 0)     // intermediate
			     .collect(Collectors.toSet()); // terminal
			System.out.println(evens);
			
		List<Integer> sortedList = nums               // sorting
	    .stream()
		.sorted()
		.toList();								
		System.out.println(sortedList +"sorted");
		
		
		
		List<Integer> reversesortedList = nums        // reversesorted
				.stream()
				.sorted(Comparator.reverseOrder())
				.toList();
         System.out.println(reversesortedList);
		
         
         
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Anjali",500000));
		employees.add(new Employee(2,"sai", 20000));
		employees.add(new Employee(3,"priya",30000));
		
		employees                                   // get employees > 100000
		.stream()
		.filter(emp -> emp.salary > 100000)
		//.forEach(emp -> System.out.println(emp));
		.forEachOrdered(System.out::println);
        
		List<Employee> sortedEmployee =  employees
		.stream()
		.sorted((emp1,emp2)-> Integer.compare(emp1.salary , emp2.salary))
		.toList();		
		System.out.println(sortedEmployee);
		
		List<Employee> salaries = employees                  // map  when we want to change or update
		.stream()
		.map((emp)-> new Employee(emp.id ,emp.name, (emp.salary += 5000)))
		//.forEach(emp -> System.out.println(emp));
		.toList();
		  System.out.println(salaries);
		  
		  List<Employee>names=employees               // start with name
		  .stream()
		  .filter(emp -> emp.name.startsWith("A"))
		  .toList();
		  System.out.println(names);
		  
		  List<Employee>name=employees                  // ends with - name
				  .stream()
				  .filter(emp -> emp.name.endsWith("a"))
				  .toList();
				  System.out.println(name);  
				  
	     List<Integer> unique=nums
	     .stream()
	     .distinct()                     // unique elements
	     .toList();
	     System.out.println();
	     System.out.println(unique);
	     
	    Integer integer = nums                   // find  highest value from a list
	     .stream()
	     .sorted(Comparator.reverseOrder())
	     .findFirst()
	     .get();
	    System.out.println(integer);
	    
	    Integer secondhighest = nums      //second highest
	    .stream()
	    .distinct()
	    .sorted(Comparator.reverseOrder())   // descending order
	    .skip(1)
	    .findFirst()
	    .get();
	    System.out.println(secondhighest);
	}
}

