package entities;

public class TechnicalStudent extends Student{

	private String professionalRecord;
	
	public TechnicalStudent (String name, Integer age, String gender, String matriculation, String course, String professionalRecord) {
		super(name, age, gender, matriculation, course);
		this.professionalRecord = professionalRecord;
	}
	
	public void toPractice() {
		System.out.println("Practicing! ");
	}
	
	public String getProfessionalRecord() {
		return professionalRecord;
	}
}
