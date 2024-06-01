package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);

	}

	@Override
	public void withdraw(Double amount) {
		setBalance(getBalance() - (amount + 7));
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
}
