package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex");
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// Só consigo fazer um Downcasting reversivo para o tipo anteriormente instanciado
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 =  (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}
}
