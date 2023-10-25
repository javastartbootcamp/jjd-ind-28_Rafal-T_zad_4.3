package pl.javastart.task;

public class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateTrianglePerimeter() {
        return 0.5 * this.base * this.height;
    }
}
