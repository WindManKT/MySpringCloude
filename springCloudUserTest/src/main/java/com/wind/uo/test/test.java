package com.wind.uo.test;

import com.wind.uo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Autowired
   static UserService userService;

    public static void main(String[] args) {

        System.out.println(userService);
    }
}
