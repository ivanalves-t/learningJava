package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Car rental pickup (dd/MMM/yyyy): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Devolution (dd/MMM/yyyy): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		System.out.print("Enter hour price: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter daily price: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		System.out.printf("Basic payment: %.2f\n" , cr.getInvoice().getBasicPayment());
		System.out.printf("Tax: %.2f\n" , cr.getInvoice().getTax());
		System.out.printf("Total payment: %.2f" , cr.getInvoice().getTotalPayment());
		
		sc.close();
	}

}
