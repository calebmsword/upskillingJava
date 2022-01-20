package com.revature.app;

import com.revature.EmployeeNotFoundException;
import com.revature.beans.Employee;
import com.revature.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App_02 {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
        List<Employee> employees = employeeService.findAll();
        employees.stream().forEach(System.out::println);



//        try {
//            Employee e1 = null;
//            e1 = employeeService.find(3);
//        } catch (EmployeeNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            Employee e1 = employeeService.save(new Employee("George", 20));
            e1.setName("George Jr.");
            employeeService.update(e1);
            employeeService.findAll().stream().forEach(System.out::println);
            System.out.println("Employee with id "+e1.getId()+": "+e1);
        } catch (EmployeeNotFoundException e) {
            e.printStackTrace();
        }
    }

}
