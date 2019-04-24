package com.zwh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProductApplication.class, args);
    }

}
