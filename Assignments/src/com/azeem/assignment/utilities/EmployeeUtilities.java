package com.azeem.assignment.utilities;

import com.azeem.assignment.employees.Developer;
import com.azeem.assignment.employees.Employee;
import com.azeem.assignment.employees.Manager;

public class EmployeeUtilities {
	
	public static void printEmployeeDetails(Employee employee) {
		System.out.println("Employee Name: "+ employee.getName());
		System.out.println("Employee EmployeeId: "+ employee.getEmployeeId());
		System.out.println("Employee Salary: "+ employee.getSalary());
	
	
	 if (employee instanceof Manager) {
         Manager manager = (Manager) employee;
         System.out.println("Department Name: " + manager.getDepartment());
         System.out.println("Budget: " + manager.getBudget());
         
     } else if (employee instanceof Developer) {
         Developer developer = (Developer) employee;
         System.out.println("Email: " + developer.getEmail());
         System.out.println("Phone: " + developer.getPhone());
     }
	     
	 }
}

