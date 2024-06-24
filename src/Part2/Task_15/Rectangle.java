package Part2.Task_15;

public class Rectangle extends Shape {

    public Rectangle(double radius, double width, double height) {
        super(radius, width, height);
    }

    // Інші поля та методи
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getLength() {
        return 0.0;
    }

    public double getWidth() {
        return 0.0;
    }
}

