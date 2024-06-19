package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
@Controller

public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("listOFCars", carService.getCars(count));
        System.out.println(model.size());
        return "cars";
    }
}
