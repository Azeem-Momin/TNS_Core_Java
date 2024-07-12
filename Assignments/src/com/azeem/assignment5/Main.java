package com.azeem.assignment5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary for azeem: ");
        double azeemSalary = scanner.nextDouble();
        TaxPayer azeem = new Azeem(azeemSalary);
        
        System.out.print("Enter your salary for mohd: ");
        double mohdSalary = scanner.nextDouble();
        TaxPayer mohd = new Mohd(mohdSalary);

        System.out.println("Tax calculation by azeem:");
        azeem.displayTax();

        System.out.println("Tax calculation by mohd:");
        mohd.displayTax();

        scanner.close();
    }
}
