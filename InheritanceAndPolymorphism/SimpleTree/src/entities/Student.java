package entities;

public class Student extends Person{

	private String matriculation;
	private String course;
	
	public Student (String name, Integer age, String gender, String matriculation, String course) {
		super(name, age, gender);
		this.matriculation = matriculation;
		this.course = course;
	}
	
	public void payMonthlyFee () {
		System.out.println("Paid!");
	}

	public String getMatriculation() {
		return matriculation;
	}

	public String getCourse() {
		return course;
	}
	
	
}
