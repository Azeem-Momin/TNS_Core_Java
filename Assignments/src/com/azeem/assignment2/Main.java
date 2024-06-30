package com.azeem.assignment2;

//Main method
public class Main{
public static void main(String[] args) {
    // Create an object of Commission class
	Student s = new Student();
    Commission employee = new Commission();
    
    // Call the method to accept details
    employee.acceptDetails();
    
    // Display the details and commission
    employee.displayDetails();
}
}
