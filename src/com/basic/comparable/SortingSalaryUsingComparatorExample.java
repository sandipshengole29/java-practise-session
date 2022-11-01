package com.basic.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//let's sort the employee based on an id in ascending order returns a negative integer, zero, or a positive integer 
//as this employee id is less than, equal to, or greater than the specified object.

class Employee3 {
	Integer empId;
	String empName;
	Integer empSalary;
	
	public Employee3(Integer empId, String empName, Integer empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	public static Comparator<Employee3> sortEmployeeBySalary = new Comparator<Employee3>() {
		@Override
		public int compare(Employee3 e1, Employee3 e2) {
			return e1.getEmpSalary() - e2.getEmpSalary();
		}
	};
}

public class SortingSalaryUsingComparatorExample {
	public static List<Employee3> employees = new ArrayList<>();
	public static List<Employee3> sal_emp_comparator = new ArrayList<>();
	public static List<Employee3> name_emp_comparator = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee3 e1 = new Employee3(1, "empD", 432);
		Employee3 e2 = new Employee3(6, "empB", 234);
		Employee3 e3 = new Employee3(9, "empC", 906);
		Employee3 e4 = new Employee3(4, "empY", 90);
		Employee3 e5 = new Employee3(3, "empQ", 2314);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.err.println("Current employee List: ");
		employees.stream().forEach(System.out::println);
		
		Collections.sort(employees, Employee3.sortEmployeeBySalary);
		System.err.println("Sort employee by Salary: ");
		employees.stream().forEach(System.out::println);
	}
}
