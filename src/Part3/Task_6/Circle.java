package Part3.Task_6;

public class Circle extends Shape {

    public Circle(double radius, double width, double height) {
        super(radius, width, height);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadiusValue() {
        return radius;
    }
}
