package com;

import java.util.ArrayList;
import java.util.Arrays;

public class RemDuplicates_asList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,20,30,30)); //Arrays.asList - add multiple values single list at a time
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		for(Integer nums : numbers) {
			if(!resultList.contains(nums)) {
				resultList.add(nums);
			}
		}
		System.out.println(numbers);
		System.out.println(resultList);
	}
   
}
