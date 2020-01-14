package com.wind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StarterES02 {
    public static void main(String[] args) {
        SpringApplication.run(StarterES02.class,args);
    }
}
