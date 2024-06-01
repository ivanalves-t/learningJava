package condition;

import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        A = kk.nextInt();
        B = kk.nextInt();
        C = kk.nextInt();
        D = kk.nextInt();

        DIFERENCA = (A*B - C*D);
        System.out.println("DIFERNCA = " + DIFERENCA);
        kk.close();
    }
}
