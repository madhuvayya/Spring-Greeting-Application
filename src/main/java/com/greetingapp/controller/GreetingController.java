package com.greetingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @RequestMapping(value = {"","/"})
    public String GeneralGreeting(){
        return "Hello";
    }
}
