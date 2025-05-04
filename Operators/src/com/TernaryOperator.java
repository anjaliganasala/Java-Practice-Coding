package com;

public class TernaryOperator {
	public static void main(String[] args) {
		int marks = 99;
		String grade = (marks>90 && marks<=100)? "GradeA":
		               (marks>70 && marks<=90)?  "GradeB":
		               (marks>50 && marks<=70)?  "GradeC":
		               (marks>0 && marks<=50)?   "Fail":
		            	"Invalid marks";
		System.out.println("Input :"+marks+"-> Output :"+grade);
	}

}
