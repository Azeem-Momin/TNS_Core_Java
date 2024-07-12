package com.azeem.assignment5;


public class Azeem extends TaxPayer {

    public Azeem(double salary) {
        super(salary);
    }

    public double calculateTax() {
        return salary * 0.15;
    }
}