package com.revature;

import com.revature.beans.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        ctxt.getBean("bean");

        HelloBean helloBean = (HelloBean)ctxt.getBean("bean");
        HelloBean otherBean = (HelloBean)ctxt.getBean("bean");

        System.out.println(helloBean.getSlno() + " " + helloBean.getName());

        if (helloBean == otherBean) {
            System.out.println("Single bean");
        }
        else {
            System.out.println("Different beans");
        }
    }
}
