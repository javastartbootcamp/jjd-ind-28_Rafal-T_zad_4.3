package pl.javastart.task;

import static java.lang.Math.PI;

public class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        return square.getA() * square.getA();
    }

    public double calculateCircleArea(Circle circle) {
        return PI * circle.getR();
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return 0.5 * triangle.getBase() * triangle.getHeight();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }
}
