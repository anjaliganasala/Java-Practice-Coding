package com.compare;       // comaprator

public class Employee {
 
	int empId;
	
	String company;
	
	String empName;
	
	public Employee() {
		
	}
	public Employee(int empId, String company , String empName) {
		this.empId = empId;
		this.company = company;
		this.empName = empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", company=" + company + ", empName=" + empName + "]";
	}
	
}
