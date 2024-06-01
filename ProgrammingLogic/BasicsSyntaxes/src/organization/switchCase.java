package organization;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid value";
        };
        if (!dia.equals("Invalid value")) {
            System.out.println("Week day: " + dia);
        } else {
            System.out.println("Invalid value");
        }
        sc.close();
    }
}

