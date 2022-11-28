package web.service;

import web.module.Car;

import java.util.List;

public interface CarService {
    public List<Car> getPartOfCarsList(int countCars);
}
