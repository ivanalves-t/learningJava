package loopFor;

import java.util.Scanner;

public class for04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt(), d = sc.nextInt();

            if (d == 0){
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n", (double) n/d);
            }
        }
    }
}
