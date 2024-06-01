package entities;

public class ScholarshipStudent extends Student{

	private double sholarship;
	
	public void renewScholarship() {
		System.out.println("Renewing sholarship of " + name);
	}
	
	@Override
	public void payMonthlyFee() {
		super.payMonthlyFee();
		System.out.println(name + "get's a discount for being sholarship!");
	}

	public double getSholarship() {
		return sholarship;
	}

	public void setSholarship(double sholarship) {
		this.sholarship = sholarship;
	}
}
