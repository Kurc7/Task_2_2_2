package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Electro", 20000));
        cars.add(new Car("Lada", "L4", 6000));
        cars.add(new Car("Ferrari", "V8", 30000));
        cars.add(new Car("Toyota", "L6", 13000));
        cars.add(new Car("Паз", "V8", 15000));
        if (count != null && count < 6 && count >= 0) {
            List<Car> subCars = cars.subList(0, count);
            model.addAttribute("cars", subCars);
        } else {
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}