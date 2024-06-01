package loopFor;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), res = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            res += num;
        }
        System.out.println(res);
    }
}
