package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.module.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String getPartOfCarsList(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> partOfList = getCarsList();
        model.addAttribute("cars", partOfList.subList(0, count));
        return "cars";
    }

    public List<Car> getCarsList(){
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
