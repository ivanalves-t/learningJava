package App;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        double tax = scanner.nextDouble();
        Employee employee = new Employee(name,grossSalary,tax);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());
        System.out.println();
        System.out.println(employee);
    }
}
