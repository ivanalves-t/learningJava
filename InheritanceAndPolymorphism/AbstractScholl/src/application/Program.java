package application;

import entities.Professor;
import entities.ScholarshipStudent;
import entities.Student;
import entities.Visitor;

public class Program {

	public static void main(String[] args) {
		// Person p1 = new Person();
		Visitor v1 = new Visitor();
		v1.setName("Predo");
		v1.setAge(22);
		v1.setGender("Male");
		System.out.println(v1);
		System.out.println("-=-=-=-=-=-=-=-=-=-\n");
		
		Student s1 = new Student();
		s1.setAge(23);
		s1.setCourse("IT");
		s1.setGender("Female");
		s1.setMatriculation(1212);
		s1.setName("Mary");
		s1.payMonthlyFee();
		System.out.println(s1);
		System.out.println("-=-=-=-=-=-=-=-=-=-\n");
		
		ScholarshipStudent s2 = new ScholarshipStudent();
		s2.setMatriculation(1313);
		s2.setAge(17);
		s2.setSholarship(13.2);
		s2.setGender("Male");
		s2.setName("Bobby");
		s2.payMonthlyFee();
		System.out.println("-=-=-=-=-=-=-=-=-=-\n");
		
		Professor p1 = new Professor();
		p1.setName("Jhon");
		p1.setAge(42);
		p1.setGender("Male");
		p1.setExpertise("Phd. Computer Science");
		p1.setWage(1000.00);
		System.out.println(p1.getName() + "'s wage : $" + p1.getWage());
		p1.receiveARaise(500.0);
		System.out.println(p1.getName() + "'s new wage : $" + p1.getWage());
		System.out.println(p1);
	}
}
