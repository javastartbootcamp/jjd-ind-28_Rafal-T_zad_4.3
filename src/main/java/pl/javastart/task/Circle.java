package pl.javastart.task;

import static java.lang.Math.PI;

public class Circle {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateCircleArea() {
        return PI * this.r;
    }

}
