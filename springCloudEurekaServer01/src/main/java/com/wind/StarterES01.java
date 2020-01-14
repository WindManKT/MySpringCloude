package com.wind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StarterES01 {
    public static void main(String[] args) {
        SpringApplication.run(StarterES01.class,args);
    }
}
