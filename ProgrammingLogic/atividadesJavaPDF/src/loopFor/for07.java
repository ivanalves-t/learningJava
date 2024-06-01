package loopFor;

import java.util.Scanner;

public class for07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            System.out.print(i * i + " ");
            System.out.println(i * i * i);
        }
    }
}
