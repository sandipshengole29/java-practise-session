package com.basic.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class Employee1{
	int empId;
	String empName;
	double empSalary;
	
	public Employee1(int empId, String empName, double empSalary) {
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}

public class SecondHighestSalaryEmployee {
	public static List<Employee1> employees = new ArrayList<>();
	public static List<Employee1> sortedList = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee1 e1 = new Employee1(1, "empD", 432);
		Employee1 e2 = new Employee1(2, "empB", 234);
		Employee1 e3 = new Employee1(3, "empC", 906);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		System.err.println("Current employee List: ");
		employees.stream().forEach(System.out::println);
		
		System.err.println("Sorted employee List by salary: ");
		sortedList = employees.stream().sorted(Comparator.comparing(Employee1::getEmpSalary).reversed()).collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
		
		System.err.println("2nd Highest Salary of employee: ");
		System.out.println(sortedList.get(1));
		
		System.err.println("Reverse employee List by name: ");
		sortedList = employees.stream().sorted(Comparator.comparing(Employee1::getEmpName)).collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
	}
}
