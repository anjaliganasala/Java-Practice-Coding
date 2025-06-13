package com;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Sorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,10,5,12,15,20,4));
		
		System.out.println("Before sortig :" +list);
		
		for(int i=0; i<list.size()-1; i++) {
			
			for(int j=0; j<list.size()-i-1; j++) {
				
				if(list.get(j) > list.get(j+1)) {
					
				 int temp = list.get(j);
				
				 list.set(j , list.get(j+1));
				 
				 list.set(j+1, temp);
			}
				
		  }
			
		}
	    System.out.println("after sorting :" +list);
	}
	
}
