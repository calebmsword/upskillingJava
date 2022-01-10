package com.revature;

import com.revature.beans.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", "Doe", "john.doe@gmail.com"));
        employees.add(new Employee(102, "Mary", "Jane", "mary.jane@gmail.com"));
        employees.add(new Employee(103, "Stan", "Lee", "dc.sucks@gmail.com"));
        employees.add(new Employee(104, "George", "Takeo", "george.takeo@gmail.com"));
        employees.add(Employee.parseEmployee("105, Martin, Sheen, martin.sheen@gmail.com"));
        Employee emp106 = new Employee(106, "Mark", "Brown", "mark.brown@gmail.com");
        employees.add(emp106);

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            System.out.println(employee.toCSV());
        }
    }
}
