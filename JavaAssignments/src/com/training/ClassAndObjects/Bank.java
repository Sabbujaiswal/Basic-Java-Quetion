package com.training.ClassAndObjects;

public class Bank {
	double balance;
	Bank(double x){
		balance = x;
	}
	public void withdraw(int x) {
		balance -= x;
	}
	public void deposit(int x) {
		balance += x;
	}
	double getBalance() {
		return balance;

}
}
