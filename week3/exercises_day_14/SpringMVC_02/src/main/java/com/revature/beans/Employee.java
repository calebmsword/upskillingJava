package com.revature.beans;

public class Employee {
    int id;
    String name;
    int deptno;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptno=" + deptno +
                '}';
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
