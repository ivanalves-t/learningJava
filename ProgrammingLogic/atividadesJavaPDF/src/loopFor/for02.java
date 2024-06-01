package loopFor;

import java.util.Scanner;

public class for02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0, out = 0, N = sc.nextInt(), num = 0;

        for (int i = 0; i < N; i ++){
            num = sc.nextInt();
            if (num >= 10 && num <= 20){
                ++in;
            } else {
                ++out;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
