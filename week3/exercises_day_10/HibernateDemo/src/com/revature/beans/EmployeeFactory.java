package com.revature.beans;

import com.revature.beans.Employee;

public class EmployeeFactory {
    static Employee employee = null;

    public static Employee getEmployee() {
        if (employee == null) {
            employee = new Employee();
        }
        return employee;
    }

    protected EmployeeFactory() {
        // no instantiation allowed!   >:(
    }
}
