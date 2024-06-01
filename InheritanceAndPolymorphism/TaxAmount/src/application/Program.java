package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data:\n", (i + 1));
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ic == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numEmployees));

			}

		}
		sc.close();

		System.out.println("\nTAXES PAID:");
		double sum = 0;
		for (TaxPayer t : list) {
			System.out.printf("%s: $ %.2f\n", t.getName(), t.tax());
			sum += t.tax();
		}
		System.out.printf("\nTOTAL TAXES: $ %.2f", sum);

	}
}
