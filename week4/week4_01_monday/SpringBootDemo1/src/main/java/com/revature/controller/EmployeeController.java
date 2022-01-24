package com.revature.controller;

import com.revature.beans.Employee;
import com.revature.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    public Employee save(Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
