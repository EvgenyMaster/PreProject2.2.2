package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCar(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, 100, "Audi"));
        carList.add(new Car(2, 745, "BMW"));
        carList.add(new Car(3, 2, "Volkswagen"));
        carList.add(new Car(4, 2101, "Lada"));
        carList.add(new Car(5, 140, "Mercedes"));
        return carList.subList(0, (count >= 5 ? carList.size() : count));
    }
}
