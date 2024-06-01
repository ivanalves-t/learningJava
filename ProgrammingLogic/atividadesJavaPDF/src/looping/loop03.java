package looping;

import java.util.Scanner;

public class loop03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alcool = 0, gas = 0, diesel = 0, cod = sc.nextInt();

        while (cod != 4){
            cod = sc.nextInt();
            switch (cod) {
                case 1 -> alcool += 1;
                case 2 -> gas += 1;
                case 3 -> diesel += 1;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);

    }
}
