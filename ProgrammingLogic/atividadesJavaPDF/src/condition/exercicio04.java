package condition;

import java.util.Scanner;
import java.util.Locale;
public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int NUMBER, h;
        double SALARY, payment;

        NUMBER = sc.nextInt();
        h = sc.nextInt();
        payment = sc.nextDouble();

        SALARY = h * payment;
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f", SALARY);

        sc.close();
    }
}
