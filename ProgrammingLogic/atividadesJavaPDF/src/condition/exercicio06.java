package condition;

import java.util.Locale;
import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, TRI,CIR,TRAP,QUA,RET, PI;

        PI = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        TRI = A*C / 2;
        CIR = PI * Math.pow(C, 2);
        TRAP = ((A+B)*C)/2;
        QUA = Math.pow(B, 2);
        RET = A*B;

        System.out.printf("TRIANGULO: %.3f%n " , TRI);
        System.out.printf("CIRCULO: %.3f%n" , CIR);
        System.out.printf("TRAPEZIO: %.3f%n" , TRAP);
        System.out.printf("QUADRADO: %.3f%n" , QUA);
        System.out.printf("RETANGULO: %.3f%n" , RET);

        sc.close();
    }
}
