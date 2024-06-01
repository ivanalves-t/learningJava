package matematica;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class piloto {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double meansure = 53.234567;

        System.out.printf("Products: %n%s, which price is $ %.2f %n%s, which price is $ %.2f", product1, price1, product2, price2);
        System.out.printf("%n%nRecord: %d years old, code %d and gender: %c%n%n", age, code, gender);
        System.out.printf("Meansure with eight decimal places: %.8f%nRouded (three decimal places): %.3f%n", meansure, meansure);
        System.out.printf(Locale.US,"US decimal point: %.3f",meansure);
    }
}
