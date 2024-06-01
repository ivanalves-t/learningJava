package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount (Integer number, String holder, Double interestRate) {
		super(number, holder);
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void updateBalance() {
		balance *= interestRate;
	}
}
