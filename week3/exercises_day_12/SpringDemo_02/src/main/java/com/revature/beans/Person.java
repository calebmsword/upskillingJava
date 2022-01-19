package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int slno;
    String name;
    @Autowired
    Address address;

    public Person() {
    }

    public Person(int slno, String name, Address address) {
        this.slno = slno;
        this.name = name;
        this.address = address;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "slno=" + slno +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
