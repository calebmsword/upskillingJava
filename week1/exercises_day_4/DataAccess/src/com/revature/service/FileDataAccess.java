package com.revature.service;

import com.revature.beans.Employee;

public class FileDataAccess implements IDataAccess {
    @Override
    public void save(Employee employee) {
        System.out.println("Now saving " + employee);
    }

    @Override
    public Employee read() {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
