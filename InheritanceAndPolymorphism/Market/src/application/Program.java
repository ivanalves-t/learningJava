package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data: \n", i + 1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char cui = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			switch (cui) {

			case 'c':
				Product p1 = new Product(name, price);
				products.add(p1);
				break;
			case 'i':
				System.out.print("Customs fee: ");
				Double cFee = sc.nextDouble();
				Product p2 = new ImportedProduct(name, price, cFee);
				products.add(p2);
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate mfDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product p3 = new UsedProduct(name, price, mfDate);
				products.add(p3);
				break;
			}
		}
		sc.close();
		System.out.println("\nPRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
	}
}
