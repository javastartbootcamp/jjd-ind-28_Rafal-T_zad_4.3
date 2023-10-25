package pl.javastart.task;

public class Square {
    private final double a;

    Square(double a) {
        this.a = a;
    }

    public double calculateSquareArea() {
        return this.a * this.a;
    }

}
