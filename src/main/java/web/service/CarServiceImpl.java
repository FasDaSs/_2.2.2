package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>(5);
        cars.add(new Car("Test1", 1, "Red"));
        cars.add(new Car("Test2", 2, "Black"));
        cars.add(new Car("Test3", 3, "Yellow"));
        cars.add(new Car("Test4", 4, "Blue"));
        cars.add(new Car("Test5", 5, "Gray"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count > 5 ? 5 : count);
    }
}
