package com.revature;

import com.revature.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.getAddress());
    }
}
