package com.azeem.assignment.employees;

public class Employee {
	
	private String name;
	private String employeeId;
	private double salary;
	
	Employee(){
		System.out.println("Base");
	}
	
	 public Employee(String name, String employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int emplyeeId) {
		this.employeeId = employeeId;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
