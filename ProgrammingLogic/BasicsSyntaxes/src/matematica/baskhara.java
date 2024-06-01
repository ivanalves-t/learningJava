package matematica;

import java.util.Scanner;

public class baskhara {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        a = sc.nextDouble();

        System.out.println("Digite o valor de b");
        b = sc.nextDouble();

        System.out.println("Digite o valor de c");
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - 4*a*c;
        sc.close();

        x1 = (-b + Math.sqrt(delta))/(2.0*a);
        x2 = (-b - Math.sqrt(delta))/(2.0*a);

        System.out.printf("%nValor de x' = %.2f %n",x1);
        System.out.printf("Valor de x'' = %.2f %n",x2);

    }
}
