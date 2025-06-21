package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
      Integer sum = nums
		.stream()
		.reduce(0, (a,b)->a+b);
		
	  System.out.println(sum);
     Integer multiply = nums
		             .stream()
		             .reduce(1, (a,b)->a*b);
     System.out.println(multiply);
     
     List<String> words = new ArrayList<String>(Arrays.asList("anjali","ganasala","from","MCA"));
     String finalList = words
     .stream()
     .reduce("",(a,b)-> a+ " "+b);
     System.out.println(finalList.trim());
	}

}
