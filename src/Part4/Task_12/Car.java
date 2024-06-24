package Part4.Task_12;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public static Car createCar(String brand, String model, int year, String color){
        Car car = new Car(brand, model, year,color);
        car.registerCar();
        return car;
    }
    private void registerCar() {
        // Логіка реєстрації автомобіля
        System.out.println("Car registered successfully!");
    }
    // Інші методи класу
}
