package web.dao;

import web.module.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getListCars() {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("Sedan", "Blue", 4);
        Car car2 = new Car("Combi", "Red", 2);
        Car car3 = new Car("Concept", "Red", 2);
        Car car4 = new Car("Campervan", "Black", 3);
        Car car5 = new Car("Pickup", "Green", 2);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;
    }
}


