package com.azeem.assignment.employees;

public class Manager extends Employee{
	
	private String department;
	private String budget;
	
	
	public Manager(String name, String employeeId, double salary, String department, String budget){
		super(name, employeeId, salary);
		this.department = department;
		this.budget = budget;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}
		
	
	
	
	
}
