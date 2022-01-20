package com.revature.app;

import com.revature.beans.Employee;
import com.revature.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");

        Employee employee = new Employee("Caleb", 99);

        EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
        System.out.println("Saving employee: "+employee);
        Employee savedEmployee = employeeService.save(employee);
        System.out.println("Saved employee: "+savedEmployee);
        System.out.println("Employee saved succesfully!");
    }
}
