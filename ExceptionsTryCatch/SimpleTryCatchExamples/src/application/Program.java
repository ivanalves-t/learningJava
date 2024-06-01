package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("\nEnd of program");
	}
	
	public static void method1() {
		System.out.println("=-=-METHOD2 START=-=-");
		method2();
		System.out.println("=-=-METHOD2 END=-=-");
	}
	public static void method2() {
		System.out.println("=-=-METHOD2 START=-=-");
		
		Scanner scanner =  new Scanner(System.in);
		
		try {
			String[] vect = scanner.nextLine().split(" ");
			int p = scanner.nextInt();
			System.out.println(vect[p]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			scanner.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		
		scanner.close();
		System.out.println("=-=-METHOD2 END=-=-");
	}
}
