package com.azeem.assignment6;

public class Bank {
	static int totalAccounts = 0;
	
	Bank(){  //keeping track of static keyword
		totalAccounts++;
	}
	
	static int getTotalAccount() {
		return totalAccounts;
	}
}
