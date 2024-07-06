package com.azeem.assignment6;

public class Transaction {
    private final double transactionFee;

    public Transaction(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public final void performTransaction() {
        // Logic for performing the transaction
        System.out.println("Performing transaction with a fee of " + transactionFee);
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
