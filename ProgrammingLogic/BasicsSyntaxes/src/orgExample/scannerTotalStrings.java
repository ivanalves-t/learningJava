package orgExample;

import java.util.Scanner;

public class scannerTotalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        String b = sc.nextLine(), a = sc.nextLine();

        System.out.println(b + a);
    }
}
