package com.greetingapp.controller;

import com.greetingapp.model.User;
import com.greetingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
@Component
public class GreetingController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"","/"})
    public String generalGreeting(){
        return "Hello";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        if(userService.addUser(user))
           return "hai"+ user.getName();
        return "false";
    }
}
