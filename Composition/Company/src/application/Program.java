package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name : ");
		String dp = sc.nextLine();
		System.out.print("Enter worker data:\n");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level : ");
		String workerLevel = sc.nextLine().toUpperCase();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		Department department = new Department(dp);
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, department);

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data:", (i + 1));
			System.out.print("\nDate (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();

			HourContract hc = new HourContract(date, value, duration);
			worker.addContract(hc);
		}

		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String dateStr = sc.next();
		int month = Integer.parseInt(dateStr.substring(0,2));
		int year = Integer.parseInt(dateStr.substring(3));

		double valueIncome = worker.income(year, month);
		System.out.println(worker.toString());
		System.out.println("Income for " + dateStr + ": " + valueIncome);
		sc.close();
	}
}
