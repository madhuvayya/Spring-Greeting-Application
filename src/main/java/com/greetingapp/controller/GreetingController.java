package com.greetingapp.controller;

import com.greetingapp.dao.UserDao;
import com.greetingapp.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
@Component
public class GreetingController {

    UserDao userDao = new UserDao();

    @RequestMapping(value = {"","/"})
    public String generalGreeting(){
        return "Hello";
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if(userDao.addUser(user))
           return "hai"+ user.getName();
        return "false";
    }
}
