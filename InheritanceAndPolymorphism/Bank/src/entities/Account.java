package entities;

public class Account {

	protected Integer number;
	protected String holder;
	protected Double balance = 0.0;
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
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
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
}
