package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars(int num) {
        cars.add(new Car("car1", "color1", 111));
        cars.add(new Car("car2", "color2", 222));
        cars.add(new Car("car3", "color3", 333));
        cars.add(new Car("car4", "color4", 444));
        cars.add(new Car("car5", "color5", 555));
        return cars.stream().limit(num).collect(Collectors.toList());
    }
}
