package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample{

	public static void main(String[] args) {
		
		Set<Integer> nums = new TreeSet<Integer>(Arrays.asList(10,20,80));
		
		nums.add(20);            // ascending order 
		nums.add(30);            // does not maintain order
		nums.add(10);            // does not accept null - TreeSet why ? get "NullpointerException" when we perform operate on null
		nums.add(30);
		
		System.out.println(nums);
		
		System.out.println("_____________________________________________________________");
		
		Set<String> str = new HashSet<>(Arrays.asList("A","B","C"));
		
		str.add("Ani");                // based on size(ASCII)
		str.add("ansi");               // does not maintain order
		str.add(null);                 // accept only one null value -HashSet
		str.add(null);
		
		System.out.println(str);
		System.out.println("____________________________________________________________");
		
		Set<String> s = new LinkedHashSet<>(); 
		 s.add("Anjali");
		 s.add("vaishu");                   // same order as we given
		 s.add("chaidya");                  // maintain order
		 s.add(null);
		 s.add(null);                       // only take one null value - LinkedHashSet
		 System.out.println(s);
		 
		 
	}
}
