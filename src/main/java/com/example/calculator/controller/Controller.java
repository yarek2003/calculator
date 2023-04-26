package com.example.calculator.controller;

import com.example.calculator.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class Controller {
    private final CalcService calcService;
    public Controller (CalcService calcService){
        this.calcService = calcService;
    }
    @GetMapping("/plus")
    public String plus (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        boolean b = check(num1, num2) ;
        if (b == false) { return "Введите корректные данные";
        } else
        return num1 + "+" + num2 + "=" + calcService.plus(num1,num2) ;
    }
    @GetMapping("/minus")
    public String minus (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        boolean b = check(num1, num2) ;
        if (b == false) { return "Введите корректные данные";
        } else
        return num1 + "-" + num2 + "=" + calcService.minus(num1,num2) ;
    }
    @GetMapping("/multiply")
    public String multiply (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        boolean b = check(num1, num2) ;
        if (b == false) { return "Введите корректные данные";
        } else
        return num1 + "*" + num2 + "=" + calcService.multiply(num1,num2) ;
    }
    @GetMapping("/divide")
    public String divide (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        boolean b = check(num1, num2) ;
        if (b == false) { return "Введите корректные данные";
        } else if (num2 != 0) {
            return num1 + "/" + num2 + "=" + calcService.divide(num1, num2);
        } else
        return "На 0 делить нельзя";
    }
    public Boolean check (Integer num1, Integer num2){
        if (num1 != null && num2 != null) return true;
        else return false;
    }
}
