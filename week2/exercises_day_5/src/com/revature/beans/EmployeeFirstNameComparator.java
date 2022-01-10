package com.revature.beans;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.firstname.compareTo(o2.lastname);
    }
}
