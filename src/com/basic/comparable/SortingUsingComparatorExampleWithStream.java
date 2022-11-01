package com.basic.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//let's sort the employee based on an id in ascending order returns a negative integer, zero, or a positive integer 
//as this employee id is less than, equal to, or greater than the specified object.

class Employee2 {
	Integer empId;
	String empName;
	Integer empSalary;
	
	public Employee2(Integer empId, String empName, Integer empSalary) {
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
}

public class SortingUsingComparatorExampleWithStream {
	public static List<Employee2> employees = new ArrayList<>();
	public static List<Employee2> sal_emp_comparator = new ArrayList<>();
	public static List<Employee2> name_emp_comparator = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee2 e1 = new Employee2(1, "empD", 432);
		Employee2 e2 = new Employee2(6, "empB", 234);
		Employee2 e3 = new Employee2(9, "empC", 906);
		Employee2 e4 = new Employee2(4, "empY", 90);
		Employee2 e5 = new Employee2(3, "empQ", 2314);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.err.println("Current employee List: ");
		employees.stream().forEach(System.out::println);
		
		//Sort Employee using employee Salary
		System.err.println("Post applying Comparator on employee List for salary: ");
		Comparator<Employee2> employeeSalaryComparator = Comparator.comparingInt(Employee2::getEmpSalary);
		
		sal_emp_comparator = employees.stream().sorted(employeeSalaryComparator).collect(Collectors.toList());
		sal_emp_comparator.stream().forEach(System.out::println);
		
		//Sort Employee using employee name
		System.err.println("Post applying Comparator on employee List for name: ");
		Comparator<Employee2> employeeNameComparator = Comparator.comparing(Employee2::getEmpName);
		
		name_emp_comparator = employees.stream().sorted(employeeNameComparator).collect(Collectors.toList());
		name_emp_comparator.stream().forEach(System.out::println);
	}
}
