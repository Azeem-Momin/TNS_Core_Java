package com.azeem.assignment5;

public class Mohd extends TaxPayer {

    public Mohd(double salary) {
        super(salary);
    }

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }
}
