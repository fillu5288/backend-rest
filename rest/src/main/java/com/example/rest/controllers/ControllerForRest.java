package com.example.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody над каждым методом
@RequestMapping("/api")
public class ControllerForRest {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello"; //если перейти по api/sayHello будет хеллоу
    }

}
