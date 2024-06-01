package condition;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int a, b, d, e;
        double c, f, payment;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextDouble();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextDouble();

        payment = b * c + e * f;
        System.out.printf("VALOR A PAGAR: R$ %.2f", payment);

        scanner.close();
    }
}
