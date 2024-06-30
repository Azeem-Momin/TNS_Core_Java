package com.azeem.assignment2;
import java.util.Scanner;

public class Commission {
    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();

        System.out.print("Enter phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate the commission
    public double calculateCommission() {
        double commission = 0.0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        return commission;
    }

    // Method to display employee details and commission
    public void displayDetails() {
        System.out.println("Sales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + calculateCommission());
    }

    
}
