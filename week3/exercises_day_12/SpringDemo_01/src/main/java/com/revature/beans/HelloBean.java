package com.revature.beans;

public class HelloBean {
    int slno;
    String name;

    @Override
    public String toString() {
        return "HelloBean{" +
                "slno=" + slno +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        System.out.println("Setting slno: "+slno);
        this.slno = slno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name: "+name);
        this.name = name;
    }

    public HelloBean(int slno, String name) {
        System.out.println("Hello beans' all arg constructor");
        this.slno = slno;
        this.name = name;
    }

    public HelloBean() {
        System.out.println("Hello beans' no arg constructor");
    }
}
