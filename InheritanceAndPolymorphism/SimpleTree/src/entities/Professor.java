package entities;

public class Professor extends Person{

	private String expertise;
	private Double wage;
	
	public Professor (String name, Integer age, String gender, String expertise, Double wage) {
		super(name, age, gender);
		this.expertise = expertise;
		this.wage = wage;
	}

	public String getExpertise() {
		return expertise;
	}

	public Double getWage() {
		return wage;
	}
	
	
}
