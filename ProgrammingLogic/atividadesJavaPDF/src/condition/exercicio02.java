package condition;

import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI, A, raio;
        PI = 3.14159;

        raio = sc.nextDouble();
        A = Math.pow(raio,2)*PI;

        System.out.printf("A=%.4f",A);

        sc.close();
    }
}
