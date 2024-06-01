package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000.00 && getHealthExpenditures() == 0) {
			return (getAnnualIncome() * 0.15);
		} else {
			return (getAnnualIncome() * 0.25) - (getHealthExpenditures() * 0.50);
		}
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
}
