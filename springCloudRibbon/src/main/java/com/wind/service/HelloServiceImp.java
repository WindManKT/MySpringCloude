package com.wind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImp implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-Hi/hi?name="+name,String.class);
    }
}
