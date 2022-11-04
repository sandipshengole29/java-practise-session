package com.basic.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee6{
	int empId;
	String empName;
	double empSalary;
	String department;
	
	public Employee6(int empId, String empName, double empSalary, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "{empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "}";
	}
	
}

public class LambdaEmpGroupByDepartment {
	
	public static void main(String args[]) {
		List<Employee6> employeesList = new ArrayList<>();
		Map<String, List<Employee6>> groupByDepartment = new HashMap<>();
		Map<String, Optional<Employee6>> groupByDepartmentHavingMaxSalary = new HashMap<>();
		
		//create employee list
		Employee6 e1 = new Employee6(1, "empA", 123, "D1");
		Employee6 e2 = new Employee6(2, "empB", 456, "D1");
		Employee6 e3 = new Employee6(3, "empC", 789, "D2");
		Employee6 e4 = new Employee6(4, "empD", 143, "D3");
		Employee6 e5 = new Employee6(5, "empE", 486, "D4");
		Employee6 e6 = new Employee6(6, "empF", 739, "D3");
		
		employeesList.add(e6);
		employeesList.add(e2);
		employeesList.add(e3);
		employeesList.add(e4);
		employeesList.add(e5);
		employeesList.add(e1);
		
		System.out.println("Group employee list by Department: ");
		groupByDepartment = employeesList.stream().collect(Collectors.groupingBy(Employee6 :: getDepartment));
		groupByDepartment.entrySet().stream().forEach(System.out :: println);
		
		System.out.println("Averge Salary: ");
		double averageSalary = employeesList.stream().mapToDouble(e -> e.getEmpSalary()).average().getAsDouble();
		System.out.println(averageSalary);
		
		System.out.println("Lowest Salary employee using sorted: ");
		Optional<Employee6> lowestEmployee = employeesList.stream().sorted(Comparator.comparing(Employee6 :: getEmpSalary)).findFirst();
		System.out.println(lowestEmployee.get());
		
		System.out.println("min Salary employee: ");
		Optional<Employee6> minEmployee = employeesList.stream().min(Comparator.comparing(Employee6 :: getEmpSalary));
		System.out.println(minEmployee.get());
		
		System.out.println("max Salary employee: ");
		Optional<Employee6> maxHighestEmployee = employeesList.stream().max(Comparator.comparing(Employee6 :: getEmpSalary));
		System.out.println(maxHighestEmployee.get());
		
		System.out.println("2nd max Salary employee: ");
		List<Employee6> secondHighestEmployee = employeesList.stream().sorted(Comparator.comparing(Employee6 :: getEmpSalary).reversed()).limit(2).collect(Collectors.toList());
		System.out.println(secondHighestEmployee.get(1));
		
		System.out.println("Max salary employee in every department: ");
		groupByDepartmentHavingMaxSalary = employeesList.stream().collect(Collectors.groupingBy(Employee6 :: getDepartment, Collectors.maxBy(Comparator.comparing(Employee6 :: getEmpSalary))));
		groupByDepartmentHavingMaxSalary.entrySet().stream().forEach(System.out :: println);
	}
}