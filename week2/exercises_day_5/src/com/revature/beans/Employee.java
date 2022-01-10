package com.revature.beans;

public class Employee implements Comparable<Employee> {
    int id;
    String firstname;
    String lastname;
    String email;

    public Employee(int id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toCSV() {
        return id+", "+firstname+", "+lastname+", "+email;
    }

    public static Employee parseEmployee(String csvEmployee) {
        String[] values = csvEmployee.split(",");
        int id = Integer.parseInt(values[0].trim());
        String firstname = values[1].trim();
        String lastname = values[2].trim();
        String email = values[3].trim();
        Employee employee = new Employee(id, firstname, lastname, email);
        return employee;
    }

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }
}
