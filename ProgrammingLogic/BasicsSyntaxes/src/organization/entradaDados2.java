package organization;

import java.util.Scanner;

public class entradaDados2 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
// USANDO NEXTLINE, O PROGRAMA VAI LER O TEXTO INTEIRO, COM ESPAÇOS, POR EXEMPLO, FRASES
        sc.close();
    }
}
