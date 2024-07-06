package com.azeem.assignment6;

public abstract class Account {
	protected double balance;

	public Account(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}
}

class SavingsAccount extends Account {
	private static final double INTEREST_RATE = 0.02;

	public SavingsAccount(double initialBalance) {
		super(initialBalance);
	}

	public void addInterest() {
		balance += balance * INTEREST_RATE;
	}
}
