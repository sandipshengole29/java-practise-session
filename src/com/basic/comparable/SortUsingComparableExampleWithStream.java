package com.basic.comparable;

import java.util.ArrayList;
import java.util.List;

//let's sort the employee based on an id in ascending order returns a negative integer, zero, or a positive integer 
//as this employee id is less than, equal to, or greater than the specified object.

class Employee1 implements Comparable<Employee1>{
	int empId;
	String empName;
	int empSalary;
	
	public Employee1(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public int compareTo(Employee1 employee1) {
		return this.getEmpSalary() - employee1.getEmpSalary();
	}
	
}

public class SortUsingComparableExampleWithStream {
	public static List<Employee1> employees = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee1 e1 = new Employee1(1, "empD", 432);
		Employee1 e2 = new Employee1(6, "empB", 234);
		Employee1 e3 = new Employee1(9, "empC", 906);
		Employee1 e4 = new Employee1(4, "empY", 90);
		Employee1 e5 = new Employee1(3, "empQ", 2314);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.err.println("Current employee List: ");
		employees.stream().forEach(System.out::println);
		
		System.err.println("Post sorting employee List by Salary: ");
		employees.stream().sorted().forEach(System.out::println);
		
	}
}
