package Part2.Task_15;

public class Circle extends Shape {

    public Circle(double radius, double width, double height) {
        super(radius, width, height);
    }

    // Інші поля та методи
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return 0.0;
    }
}
