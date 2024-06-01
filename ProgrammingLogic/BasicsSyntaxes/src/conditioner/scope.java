package conditioner;

import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double discont;

        if (price < 400.00) {
            discont = price * 0.1;
        } else {
            discont = 0;
        }
        System.out.println(discont);
    }
}
