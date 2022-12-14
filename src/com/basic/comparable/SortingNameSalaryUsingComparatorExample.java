package com.basic.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//let's sort the employee based on an id in ascending order returns a negative integer, zero, or a positive integer 
//as this employee id is less than, equal to, or greater than the specified object.

class Employee4 {
	Integer empId;
	String empName;
	Integer empSalary;
	
	public Employee4(Integer empId, String empName, Integer empSalary) {
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
	
	public static Comparator<Employee5> sortEmployeeByNameAndSalary = new Comparator<Employee5>() {
		@Override
		public int compare(Employee5 e1, Employee5 e2) {
			int i = Integer.compare(e1.getEmpSalary(), e2.getEmpSalary()); //e1.getEmpName().compareTo(e2.getEmpName());
			if(i != 0) {
				return i;
			}
			i = e1.getEmpName().compareTo(e2.getEmpName()); //Integer.compare(e1.getEmpSalary(), e2.getEmpSalary());
			
			return i;
		}
	};
}

public class SortingNameSalaryUsingComparatorExample {
	public static List<Employee5> employees = new ArrayList<>();
	public static List<Employee5> sal_emp_comparator = new ArrayList<>();
	public static List<Employee5> name_emp_comparator = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee5 e1 = new Employee5(1, "empD", 432);
		Employee5 e2 = new Employee5(6, "empC", 234);
		Employee5 e3 = new Employee5(9, "empC", 906);
		Employee5 e4 = new Employee5(4, "empY", 90);
		Employee5 e5 = new Employee5(3, "empQ", 2314);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.err.println("Current employee List: ");
		employees.stream().forEach(System.out::println);
		
		Collections.sort(employees, Employee4.sortEmployeeByNameAndSalary);
		System.err.println("Sort employee by Salary and name: ");
		employees.stream().forEach(System.out::println);
	}
}
