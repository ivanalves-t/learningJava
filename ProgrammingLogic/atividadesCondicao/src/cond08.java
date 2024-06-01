import java.util.Scanner;

public class cond08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, imposto = 0, diferenca;

        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        if (salario > 4500) {
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = salario - 4500;
            imposto += diferenca * 0.28;
        } else if (salario > 3000) {
            imposto = 1000 * 0.08;
            diferenca = salario - 3000;
            imposto += diferenca * 0.18;
        } else if (salario > 2000)
            imposto = (salario - 2000) * 0.08;
        if (imposto>0) {
            System.out.printf("R$ %.2f", imposto);
        }else
            System.out.println("Isento");
    }


}

