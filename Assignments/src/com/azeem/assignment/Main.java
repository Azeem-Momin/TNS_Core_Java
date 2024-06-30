package com.azeem.assignment;

import com.azeem.assignment.employees.Developer;
import com.azeem.assignment.employees.Employee;
import com.azeem.assignment.employees.Manager;
import com.azeem.assignment.utilities.EmployeeUtilities;

/**
 * Main class for running the assignment application.
 */

public class Main {
	

    public static void main(String[] args) {
    	
      Manager manager = new Manager("Azeem", "12345",90000,"IT","4500000");
      Developer developer = new Developer("Azeem","12345",1200000,"azeemmomin369@gmail.com","7666017528");
      
      System.out.println("Manager Details:");
      EmployeeUtilities.printEmployeeDetails(manager);

      System.out.println("\nDeveloper Details:");
      EmployeeUtilities.printEmployeeDetails(developer);
    }
}