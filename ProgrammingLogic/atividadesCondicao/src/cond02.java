import java.util.Scanner;

public class cond02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        if (a %2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
