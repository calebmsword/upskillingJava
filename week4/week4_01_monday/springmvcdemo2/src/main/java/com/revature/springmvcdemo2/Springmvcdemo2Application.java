package com.revature.springmvcdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.revature"})
public class Springmvcdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springmvcdemo2Application.class, args);
    }

}
