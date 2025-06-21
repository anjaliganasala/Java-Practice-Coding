package com.programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringFrequency {
	
	public static void main(String[] args) {
		
		// string frequency
		
		List<String> fruits = new ArrayList<String>(Arrays.asList("apple","banana","apple","guava","mango"));
		
		Map<String, Long> frequency = fruits
	     .stream()
	     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       
		System.out.println(frequency);
		
		String fruit = "Apple";         // char frequency
		

		Map<Character, Long> charfrequency =
		fruit
		.toLowerCase()
		.chars()
		.mapToObj(c ->(char) c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
	    System.out.println(charfrequency);
	    
	    int[] a = {1,2,3,4,5};
	    Arrays
	    .stream(a)
	    .filter(n ->n%2==0)
	    .forEach(System.out::println);
			
		}
	}

