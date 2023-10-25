package pl.javastart.task;

public class Rectangle {
    private final double a;
    private final double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateRectPerimeter() {
        return this.a * this.b;
    }
}
