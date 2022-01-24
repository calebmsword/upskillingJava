package com.revature.controller;

import com.revature.beans.Employee;
import com.revature.exception.EmployeeNotFoundException;
import com.revature.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) throws EmployeeNotFoundException {
        Employee employee = employeeService.findEmployeeById(id);
        ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(employee, HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.findAll();
        ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
        return responseEntity;
    }


    @PostMapping("")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.editEmployee(employee),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable int id) {
        return new ResponseEntity<Employee>(employeeService.deleteEmployee(id),HttpStatus.OK);
    }
}
