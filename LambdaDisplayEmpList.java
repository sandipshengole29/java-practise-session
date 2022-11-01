package com.basic.lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface DisplayEmployee{
	public void displayEmp(List<Employee> employeeList);
}

class Employee{
	int empId;
	String empName;
	float empSalary;
	
	public Employee(int empId, String empName, float empSalary) {
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
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}

public class LambdaDisplayEmpList {
	public static List<Employee> employees = new ArrayList<>();
	
	public static void main(String args[]) {
		Employee e1 = new Employee(1, "empA", 123);
		Employee e2 = new Employee(2, "empB", 456);
		Employee e3 = new Employee(3, "empC", 789);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		DisplayEmployee displayEmployee = employees -> {
			for (Employee emp : employees) {
				System.out.println(emp);
			}
		};
		displayEmployee.displayEmp(employees);
	}
}
