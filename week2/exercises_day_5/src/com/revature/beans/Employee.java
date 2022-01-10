package com.revature.beans;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
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

    public int hashCode() {
        int hash = 13;
        hash = ( hash * 7 ) + ( id );
        hash = ( hash * 7 ) + ( firstname == null  ? 0 : firstname.hashCode() );
        hash = ( hash * 7 ) + ( lastname == null ? 0 : lastname.hashCode() );
        hash = ( hash * 7 ) + ( email == null ? 0 : email.hashCode() );
        return hash;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        if (object instanceof Employee && this == object) {
            return true;
        }
        Employee employee = (Employee) object;
        return this.id == employee.getId()
                && this.firstname.equals(employee.getFirstname())
                && this.lastname.equals(employee.getLastname())
                && this.email.equals(employee.getEmail());
    }
}
