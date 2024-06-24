package Part3.Task_6;

public class Shape {
    protected double radius;
    protected double width;
    protected double height;

    public Shape(double radius, double width, double height) {
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return 0; // Заглушка
    }

    public double getPerimeter() {
        return 0; // Заглушка
    }
}
