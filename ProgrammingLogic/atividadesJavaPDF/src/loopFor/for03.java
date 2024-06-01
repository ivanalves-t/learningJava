package loopFor;

import java.util.Scanner;

public class for03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        N = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double fm = (2 * n1 + 3 * n2 + 5 * n3) / (2 + 3 + 5);

            System.out.printf("%.1f%n", fm);
        }
    }
}
