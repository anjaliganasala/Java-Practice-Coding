package com;

import java.util.ArrayList;
import java.util.Scanner;

public class WithoutMap_1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values ");
		for(int i=0;i<5;i++) {
			char c = sc.next().charAt(0);
			list.add(c);
		}
		int[] arr = new int[256];
		
		for(char ch :list) {
			int num = ch;       // cast  c = a -- a=97 --arr[97]++
			arr[num]++;
		}
		for(int i=0; i<256; i++) {
			if(arr[i]!=0)
			System.out.println((char)i + " -"+ arr[i]);
		}
	}
}
