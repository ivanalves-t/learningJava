package entities;

public class Account {

	protected Integer number;
	protected String holder;
	protected Double balance;

	public Account(Integer number, String holder,Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
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
	
	public void withdraw(Double amount) {
		balance -= (amount + 5.0);
	}

	public void deposit(Double amount) {
		balance += amount;
	}
}
