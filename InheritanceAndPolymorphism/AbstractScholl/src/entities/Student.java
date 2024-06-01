package entities;

public class Student extends Person {
	
	private int matriculation;
	private String course;

	public void payMonthlyFee() {
		System.out.println("Paying monthly fee of " + name);
	}

	public int getMatriculation() {
		return matriculation;
	}

	public void setMatriculation(int matriculation) {
		this.matriculation = matriculation;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [matriculation=" + matriculation + ", course=" + course + "]";
	}

	
}
