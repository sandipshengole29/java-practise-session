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
	
	public static Comparator<Employee4> sortEmployeeByNameAndSalary = new Comparator<Employee4>() {
		@Override
		public int compare(Employee4 e1, Employee4 e2) {
			int i = e2.getEmpSalary().compareTo(e1.getEmpSalary());
			if(i != 0) {
				return i;
			}
			i = e2.getEmpSalary() - e1.getEmpSalary();
			
			return i;
		}
	};
}

public class SortingNameSalaryUsingComparatorExample {
	public static List<Employee4> employees = new ArrayList<>();
	public static List<Employee4> sal_emp_comparator = new ArrayList<>();
	public static List<Employee4> name_emp_comparator = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee4 e1 = new Employee4(1, "empD", 432);
		Employee4 e2 = new Employee4(6, "empB", 234);
		Employee4 e3 = new Employee4(9, "empC", 906);
		Employee4 e4 = new Employee4(4, "empY", 90);
		Employee4 e5 = new Employee4(3, "empQ", 2314);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.err.println("Current employee List: ");
		employees.stream().forEach(System.out::println);
		
		Collections.sort(employees, Employee4.sortEmployeeByNameAndSalary);
		System.err.println("Sort employee by Salary: ");
		employees.stream().forEach(System.out::println);
	}
}
