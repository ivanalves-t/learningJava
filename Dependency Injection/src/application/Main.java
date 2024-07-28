package application;

import services.PayService;

public class Main {

	public static void main(String[] args) {
		
		PayService payservice = new PayService();
		
		double tax = payservice.tax(1000.00);
		
		System.out.println(tax);
		
	}
}
