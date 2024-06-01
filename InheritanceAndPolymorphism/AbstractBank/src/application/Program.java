package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1003, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1002, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		double sum = 0.0;

		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("%s's balance: %.2f%n", acc.getHolder(), acc.getBalance());
		}
	}
}