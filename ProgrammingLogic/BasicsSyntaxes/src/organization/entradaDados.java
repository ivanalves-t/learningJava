package organization;

import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.printf("Digite seu nome%n%n");
        nome = sc.next();


        int idade;
        System.out.printf("Digite sua idade%n%n");
        idade = sc.nextInt();


        double denero;
        System.out.printf("Digite sua renda%n%n");
        denero = sc.nextDouble();

        char x;
        System.out.printf("Sexo?%n%n");
        x = sc.next().charAt(0);

        sc.close();

        System.out.printf("Seu nome é %s, voce tem %d anos e ganha %.2f Letra: %c", nome, idade, denero, x);
    }
}
