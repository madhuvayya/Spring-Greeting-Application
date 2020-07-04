package com.greetingapp.dao;

import com.greetingapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    List<User> userList = new ArrayList<>();

    public boolean addUser(User user){
        System.out.println("user Dao");
        return userList.add(user);
    }
}
