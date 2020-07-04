package com.greetingapp.service;

import com.greetingapp.dao.UserDao;
import com.greetingapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserDao userDao;

    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
}
