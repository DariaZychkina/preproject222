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
        List<Car> partOfList = new CarServiceImp().getCarsList();
        model.addAttribute("cars", partOfList.subList(0, count));
        return "cars";
    }
}
