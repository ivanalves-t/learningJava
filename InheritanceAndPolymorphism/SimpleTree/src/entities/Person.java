package entities;

public class Person {

	protected String name;
	protected Integer age;
	protected String gender;

	public Person() {

	}

	public Person(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void birthday() {
		System.out.println("Happy birthday!");
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

}
