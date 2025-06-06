package com;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
			
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		  ArrayList<Integer> uniqueList = new ArrayList<>();

	        for (Integer num : nums) {
	            if(!uniqueList.contains(num)) {
	                uniqueList.add(num);        // Only add if not already in the list
	            }
	        }

		System.out.println(nums);
		System.out.println(uniqueList);	
	}
}

