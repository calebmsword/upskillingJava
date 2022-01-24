package com.revature.controller;

import com.revature.beans.Employee;
import com.revature.exception.EmployeeNotFoundException;
import com.revature.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) throws EmployeeNotFoundException {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }


    @PostMapping("")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("")
    public Employee editEmployee(Employee employee) {
        return employeeService.editEmployee(employee);
    }

    public Employee deleteEmployee(int id) {
        return employeeService.deleteEmployee(id);
    }
}
