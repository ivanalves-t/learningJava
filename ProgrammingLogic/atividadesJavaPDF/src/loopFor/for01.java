package loopFor;

import java.util.Scanner;

public class for01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X >= 1 && X <= 1000) {
            for (int i = 0; i < X; i++) {
                if (i %2 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
