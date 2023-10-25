package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(2.2);
        Circle circle = new Circle(3.2);
        Triangle triangle = new Triangle(2.1, 1.4);
        Rectangle rectangle = new Rectangle(1.3, 3.4);

        System.out.printf("Pole kwadratu %s \n", square.calculateSquareArea());
        System.out.printf("Pole koła %s \n", circle.calculateCircleArea());
        System.out.printf("Pole trójkąta %s \n", triangle.calculateTrianglePerimeter());
        System.out.printf("Pole prostokąta %s \n", rectangle.calculateRectPerimeter());
    }
}
