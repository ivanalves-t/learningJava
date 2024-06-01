package doWhile;

import java.util.Scanner;

public class temperatureConversation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char loop;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double temp = sc.nextDouble();
            temp = 9 * temp / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n",temp);
            System.out.print("Deseja repetir (s/n)? ");
            loop = sc.next().charAt(0);
        } while (loop != 'n');
    }
}
