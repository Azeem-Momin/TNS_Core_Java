package com.azeem.assignment4;

public class Employee {

	private static int employeeCount = 0; // employee count to count no of employees
	private String name;
	private int id;

	Employee(String name) {
		this.name = name;
		this.id = ++employeeCount;
		System.out.println("Total Employee Count: " + employeeCount);
	}

	public void showDetails() {
		System.out.println("----Employee Details----");
		
		System.out.println("Employee ID: " + id + ", Name: " + name);
		System.out.println();
	}


}
