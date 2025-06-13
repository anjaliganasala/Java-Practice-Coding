package com;

import java.util.LinkedList;

public class LL {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>(); 

		ll.add(null);                                    
		ll.add(1);
		ll.add(2);
		ll.add(3);

		ll.addFirst(0);
		ll.addLast(4);
		System.out.println(ll);
		
		int first = ll.get(0);
		System.out.println(first);

		
		System.out.println(ll.peek());        // peek
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		System.out.println(ll.remove(0)); // remove
		System.out.println(ll);
		
		System.out.println(ll.size());   // size
		
		ll.clear();
		System.out.println(ll);
		
		
		
	}

}
