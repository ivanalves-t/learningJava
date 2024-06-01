package orgExample;

import java.util.Scanner;

public class conditionalTernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        String s = (a > b) ? "Ganhou" : "Perdeu";

        System.out.println(s);

    }

}
