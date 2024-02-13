package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int carNum, ModelMap model) {
        CarServiceImpl carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(carNum));
        return "cars";
    }

}
