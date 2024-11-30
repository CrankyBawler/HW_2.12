package pro.sky.WH_2._2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping
    public String welcome() {
        return ("Добро пожаловать в калькулятор!");

    }

    @GetMapping("/plus")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return (5);
    }
}
