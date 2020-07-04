package com.greetingapp.configuration;

import com.greetingapp.dao.UserDao;
import com.greetingapp.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.greetingapp")
public class JavaConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }
}
