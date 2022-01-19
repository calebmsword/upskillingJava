package com.revature.app;

public class App_01 {
    public static void main(String[] args) {
        System.out.println(sayHello("Caleb"));;
    }
    public static String sayHello(String name) {
        name = name.toUpperCase();
        return "Hello "+name+"!!! Have a nice day!!!";
    }
}
