package Part2.Task_5;

import java.util.ArrayList;
import java.util.List;

public class CarData {
    private List<Car> cars;

    public CarData() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    // Додаткові методи для роботи з масивом...
}
