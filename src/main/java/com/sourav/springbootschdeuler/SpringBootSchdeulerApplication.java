package com.sourav.springbootschdeuler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchdeulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchdeulerApplication.class, args);
    }

}
