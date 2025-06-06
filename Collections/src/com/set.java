package com;

import java.util.HashSet;
import java.util.Iterator;

public class set {
	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new  HashSet<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(30);  // does not allow duplicate in set
		numbers.add(null);
		numbers.add(null);
		
     	System.out.println(numbers);
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		System.out.println("---------------------------------");
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
	}

}
}
