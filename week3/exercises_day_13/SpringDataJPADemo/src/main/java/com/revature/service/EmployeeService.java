package com.revature.service;

import com.revature.beans.Employee;
import com.revature.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    // find by Id
    public Employee find(int id) {
        return employeeRepo.findById(id).get();
    }

    // find all
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepo.findAll();
    }

    // update


    // delete
    public void delete(int id) {
        employeeRepo.deleteById(id);
    }
}
