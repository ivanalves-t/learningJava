package entities;

public class TechnicalStudent extends Student{

	private String professionalRecord;
	
	public void toPractice() {
		System.out.println("Practicing");
	}

	public String getProfessionalRecord() {
		return professionalRecord;
	}

	public void setProfessionalRecord(String professionalRecord) {
		this.professionalRecord = professionalRecord;
	}
	
	
}
