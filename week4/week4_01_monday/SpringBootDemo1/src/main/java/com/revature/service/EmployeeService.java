package com.revature.service;

import com.revature.beans.Employee;
import com.revature.exception.EmployeeNotFoundException;
import com.revature.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(!employeeOptional.isPresent()) {
            new EmployeeNotFoundException("Employee not found with id: "+id);
        }
        return employeeOptional.get();
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public Employee editEmployee(Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(employee.getId());
        if(!employeeOptional.isPresent()) {
            new EmployeeNotFoundException("Employee not found with id: "+employee.getId());
        }
        return employeeRepository.save(employee);
    }

    public Employee deleteEmployee(int id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(!employeeOptional.isPresent()) {
            new EmployeeNotFoundException("Employee not found with id: "+id);
        }
        Employee employee = employeeOptional.get();
        employeeRepository.deleteById(id);
        return employee;
    }
}
