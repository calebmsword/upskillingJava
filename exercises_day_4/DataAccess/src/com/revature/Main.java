package com.revature;

import com.revature.beans.Employee;
import com.revature.service.FileDataAccess;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        FileDataAccess fileDataAccess = new FileDataAccess();
        Employee employee = new Employee(1, "Caleb", "Sword", 20);
        fileDataAccess.save(employee);
    }
}
