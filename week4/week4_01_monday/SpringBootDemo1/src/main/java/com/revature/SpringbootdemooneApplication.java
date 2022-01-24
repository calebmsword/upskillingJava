package com.revature;

import com.revature.beans.Calculator;
import com.revature.beans.Employee;
import com.revature.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemooneApplication {

    public static void main(String[] args) {

        ApplicationContext ctxt = SpringApplication.run(SpringbootdemooneApplication.class, args);

        EmployeeController controller = ctxt.getBean(EmployeeController.class);
        controller.save(new Employee("Caleb", 30));

//        Calculator calculator = ctxt.getBean(Calculator.class);
//        int sum = calculator.add(5,8);
//        System.out.println("Sum calculated by calculator component: "+sum);

        System.out.println("Welcome to Spring Boot Application");
    }

}
