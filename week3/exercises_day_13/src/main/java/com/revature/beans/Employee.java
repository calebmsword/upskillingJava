package com.revature.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int deptno;

    public Employee(String name, int deptno) {
        this.name = name;
        this.deptno = deptno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptno() {
        return deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public Employee(int id, String name, int deptno) {
        this.id = id;
        this.name = name;
        this.deptno = deptno;
    }

    public Employee() {
    }
}
