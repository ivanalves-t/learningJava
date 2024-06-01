import java.util.Scanner;

public class cond04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, resultado;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio > fim) {
            resultado = 24 - inicio + fim;
        } else if (inicio == fim) {
            resultado = 24;
        } else {
            resultado = fim - inicio;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", resultado);

        sc.close();
    }

}
