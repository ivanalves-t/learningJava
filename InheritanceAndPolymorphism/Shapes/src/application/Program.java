package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (ch == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				Shape rectangle = new Rectangle(width, height, color);
				shapes.add(rectangle);
			} else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				Shape circle = new Circle(radius, color);
				shapes.add(circle);
			}
		}
		sc.close();
		
		System.out.println("\nSHAPE AREAS:");
		for (Shape s : shapes) {
			System.out.println(String.format("%.2f", s.area()));
		}
	}
}
