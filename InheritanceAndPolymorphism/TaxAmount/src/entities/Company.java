package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public Company (String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}
