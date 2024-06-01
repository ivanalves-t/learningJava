package application;

import entities.Student;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.g1 = sc.nextDouble();
        student.g2 = sc.nextDouble();
        student.g3 = sc.nextDouble();
        System.out.println(student);
    }
}
