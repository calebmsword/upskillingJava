package com.revature.service;

import com.revature.EmployeeNotFoundException;
import com.revature.beans.Employee;
import com.revature.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    public void setEmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // save
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    // find by id
    public Employee find(int id) throws EmployeeNotFoundException {
        Optional<Employee> employeeOptional = employeeRepo.findById(id);
        if (!employeeOptional.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found with id: "+id);
        }
        else {
            return employeeOptional.get();
        }
    }

    // find all
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepo.findAll();
    }

    // update
    public Employee update(Employee employee) throws EmployeeNotFoundException {
        find(employee.getId());
        return employeeRepo.save(employee);
    }

    // delete
    public Employee delete(int id) throws EmployeeNotFoundException {
        Employee employee = find(id);
        employeeRepo.deleteById(id);
        return employee;
    }
}
