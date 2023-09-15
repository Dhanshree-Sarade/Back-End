package com.jspiders.multithreading.resource;

public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	public int checkBalance() {
		return balance;
	}
	public synchronized void deposit(int amount) {
		System.out.println("Trying to deposit " + amount + " Rs.");
		balance += amount;
		System.out.println("Deposit Successfull.");
		System.out.println("Account Balance : " + checkBalance());
	}
	public synchronized void withdraw(int amount) {
		System.out.println("Trying to withdraw " + amount + " Rs.");
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdraw Successfull.");
			System.out.println("Account Balance : " + checkBalance());
		}
		else{
			System.out.println("Insufficient Balance.");
		}
	}
}
