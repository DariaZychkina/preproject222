package web.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.controller.CarsController;
import web.dao.CarDaoImp;
import web.module.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
     private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCarsList() {
        return  carDao.getListCars();
    }
}

