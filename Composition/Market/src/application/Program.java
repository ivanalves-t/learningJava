package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date moment = new Date();
		System.out.println("Enter client data:");
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Email : ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY) : ");
		Date bDate = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Client client = new Client(name, email, bDate);
		Order order = new Order(moment, orderStatus, client);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i+1) + " data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			order.addItem(orderItem);
		}
		System.out.println("\n\nORDER SUMMARY:");
		System.out.println(order.toString());
		sc.close();
	}
}
