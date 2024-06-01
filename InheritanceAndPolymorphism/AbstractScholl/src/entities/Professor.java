package entities;

public class Professor extends Person{

	private String expertise;
	private Double wage;
	
	public void receiveARaise (Double amount) {
		System.out.println("Receiving a raise of $" + amount);
		wage += amount;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "Professor [expertise=" + expertise + ", wage=" + wage + ", name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
	
}
