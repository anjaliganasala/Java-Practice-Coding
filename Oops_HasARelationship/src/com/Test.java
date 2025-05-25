package com;

public class Test {

public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setName("anjali");
		professor.setSubject("java");
		professor.setExperience(3);

		
		Department department = new Department();           // 1st way object
		department.setName("MCA");
		department.setCountOfStudents(130);
		department.setProfessor(professor);
		
		
		Department department2 = new Department();           // 2nd way of creating object
		department2.setName("CSE");
		department2.setCountOfStudents(130);
		department2.setProfessor(new Professor("Bhagi" , "C", 5)); // should follow type sequence
		
		Department department3 = new Department( "ECE" , 100,new Professor("Vaishu", "Maths", 3));  // 3rd way object
	    
		System.out.println(department);
		System.out.println(department2);
		System.out.println(department3);
		
	}
}
