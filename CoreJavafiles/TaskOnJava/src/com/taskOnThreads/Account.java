package com.taskOnThreads;

public class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;

	}

	void deposite(int amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount + ", Current Balance: " + balance);

	}

	void withdraw(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("with draw : " + amount + ", Current Balance: " + balance);
		} else {
			System.out.println("Insufficient funds");
		}

	}

	int getBalance() {
		System.out.println("total balance is : " + balance);
		return balance;

	}

}
