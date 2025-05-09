package com;

public class ReverseArray2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] revArr= ReverseArray2.reverse(arr);
	
		for(int a : revArr) {
			System.out.print(a+ " ");
		}
	}
	
	static int[] reverse(int[] arr) {
		int[] newArr = new int[arr.length];
		int j=0;
		for(int i = arr.length-1; i>=0 ; i--) {
			newArr[j] = arr[i];
			j++;
		}
		return newArr;
	}
}

