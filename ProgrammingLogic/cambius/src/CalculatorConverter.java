import java.util.Scanner;

public class CalculatorConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarQ = sc.nextDouble();
        double result = CurrencyConverter.cambius(price,dollarQ);
        System.out.printf("Amount to be paid in reais = %.2f",result);

    }
}
