package looping;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(), res = 0;

        while (i != 0){
            res += i;
            i = sc.nextInt();
        }
        System.out.println(res);
    }
}
