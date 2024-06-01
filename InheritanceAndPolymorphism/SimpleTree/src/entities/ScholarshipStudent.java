package entities;

public class ScholarshipStudent extends Student{
	
	private String scholarship;
	
	public ScholarshipStudent (String name, Integer age, String gender, String matriculation, String course, String scholarship) {
		super(name, age, gender, matriculation, course);
		this.scholarship = scholarship;
	}
	
	public void renewScholarship() {
		System.out.println("Scholarship renewed!");
	}
	
	@Override
	public void payMonthlyFee() {
		System.out.println("Payd with discount!");
	}
	
	public String getScholarship() {
		return scholarship;
	}
}
