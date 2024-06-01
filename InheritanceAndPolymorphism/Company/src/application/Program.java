package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee newEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(newEmployee);
			}
			else {
				Employee newEmployee1 = new Employee(name, hours, valuePerHour);
				employees.add(newEmployee1);
			}
			sc.nextLine();
		}
		System.out.println("\nPAYMENTS: ");
		for (Employee e : employees) {
			System.out.println(e);
		}
		sc.close();
	}
}
