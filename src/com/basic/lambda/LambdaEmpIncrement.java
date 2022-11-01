package com.basic.lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface IncreaseSalary{
	public List<SalariedEmployee> increment(List<SalariedEmployee> employeeList, float incremet);
}

class SalariedEmployee{
	int empId;
	String empName;
	float empSalary;
	
	public SalariedEmployee(int empId, String empName, float empSalary) {
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
		return "SalariedEmployee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}

public class LambdaEmpIncrement {
	public static List<SalariedEmployee> salariedEmployees = new ArrayList<>();
	public static List<SalariedEmployee> updatedEmployees = new ArrayList<>();
	
	public static void main(String args[]) {
		//create employee list
		SalariedEmployee e1 = new SalariedEmployee(1, "empA", 123);
		SalariedEmployee e2 = new SalariedEmployee(2, "empB", 456);
		SalariedEmployee e3 = new SalariedEmployee(3, "empC", 789);
		salariedEmployees.add(e1);
		salariedEmployees.add(e2);
		salariedEmployees.add(e3);
		
		//functional method definition
		IncreaseSalary is = (salariedEmployees, increment) -> {
			List<SalariedEmployee> modifiedEmployees = new ArrayList<>();
			for (SalariedEmployee se : salariedEmployees) {
				se.setEmpSalary(se.getEmpSalary() + increment);
				modifiedEmployees.add(se);
			}
			return modifiedEmployees;
		};
		
		//invoke lambda expression
		updatedEmployees = is.increment(salariedEmployees, 10);
		
		//Print employee list
		updatedEmployees.forEach(System.out::println);

	}
}
