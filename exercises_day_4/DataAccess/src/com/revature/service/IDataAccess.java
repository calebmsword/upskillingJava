package com.revature.service;

import com.revature.beans.Employee;

public interface IDataAccess {
    public void save(Employee employee);
    public Employee read();
    public Employee update(Employee employee);
    public void delete(int id);
}
