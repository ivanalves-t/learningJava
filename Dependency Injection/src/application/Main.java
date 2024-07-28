package application;

import services.MGDeductionService;
import services.PayService;

public class Main {

	public static void main(String[] args) {
		
		PayService payService = new PayService(new MGDeductionService());
//		PayService payservice = new PayService(new SPDeductionService());
		
		double tax = payService.tax(1000.00);
// Resolution with dependency injection
		System.out.println(tax);
		
	}
}
