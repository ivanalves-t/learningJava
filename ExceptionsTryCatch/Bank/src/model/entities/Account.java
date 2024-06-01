package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	public void validateWithdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount excedds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enought balance");
		}
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

}
