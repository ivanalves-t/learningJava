package entities;

public class Rectangle {
    public double width;
    public double height;

    public String area() {
        return String.format("%.2f", 2 * (width * height));
    }

    public String perimeter() {
        return String.format("%.2f", 2 * (width + height));
    }

    public String diagonal() {
        return String.format("%.2f", Math.sqrt((width * width) + (height * height)));
    }


    public String toString() {
        return ("AREA = " + area() + "\n" + "PERIMETER = " + perimeter() + "\n" + "DIAGONAL = " + diagonal());

    }
}