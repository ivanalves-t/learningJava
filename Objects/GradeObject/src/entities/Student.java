package entities;

public class Student {
    public String name;
    public double g1, g2, g3;

    public double finalGrade() {
        return (g1 + g2 + g3);
    }

    public String toString() {
        if (finalGrade() >= 60) {
            return "FINAL GRADE = "
                    + String.format("%.2f", finalGrade()) + "\n"
                    + "PASS";
        } else {
            return "FINAL GRADE = "
                    + String.format("%.2f", finalGrade()) + "\n"
                    + "FAILED" + "\n"
                    + "MISSING "
                    + String.format("%.2f", 60 - finalGrade())
                    + " POINTS";

        }
    }
}
