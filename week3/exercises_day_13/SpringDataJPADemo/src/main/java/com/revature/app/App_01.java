package com.revature.app;

import com.revature.beans.Employee;
import com.revature.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");

        Employee employee1 = new Employee("Johnathan", 99);
        Employee employee2 = new Employee("Barack", 199);
        Employee employee3 = new Employee("Trump", 100);
        Employee employee4 = new Employee("Blake", 10);

        EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
        Employee savedEmployee = employeeService.save(employee1);

        System.out.println("Employee saved succesfully!");
    }
}
