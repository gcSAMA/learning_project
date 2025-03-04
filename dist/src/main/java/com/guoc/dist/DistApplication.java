package com.guoc.dist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(value = "com.guoc")
public class DistApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistApplication.class, args);
    }

}
