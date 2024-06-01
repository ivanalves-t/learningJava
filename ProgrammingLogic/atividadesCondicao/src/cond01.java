import java.util.Scanner;

public class cond01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Digite o número:");
        a = sc.nextInt();

        if (a < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }
}
