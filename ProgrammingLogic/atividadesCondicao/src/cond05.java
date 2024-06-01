import java.util.Scanner;
import java.util.Locale;

public class cond05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod;
        double qtd, total = 15;

        cod = sc.nextInt();
        qtd = sc.nextDouble();

        if (cod == 1) {
            total = qtd * 4.00;
        }
        if (cod == 2) {
            total = qtd * 4.50;
        }
        if (cod == 3) {
            total = qtd * 5.00;
        }
        if (cod == 4) {
            total = qtd * 2.00;
        }
        if (cod == 5) {
            total = qtd * 1.50;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }
}
