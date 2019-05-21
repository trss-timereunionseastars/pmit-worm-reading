package com.wormreading.pmit.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PmitSystemManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmitSystemManagerApplication.class, args);
    }

}
