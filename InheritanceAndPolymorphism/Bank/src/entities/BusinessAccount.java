package entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount(Integer number, String holder, Double loanLimit) {
		super(number, holder);
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
}
