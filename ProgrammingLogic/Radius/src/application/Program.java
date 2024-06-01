package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("PI value: %.2f %n", Calculator.PI);
    }

}
// Não é possível chamar um método não estático dentro de um método estático
