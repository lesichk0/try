package Part3.Task_6;

public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(0, width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
