package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        System.out.println("Inside of hello");
        return "Hello";
    }

    @RequestMapping("hai")
    public String hai() {
        System.out.println("Inside of hai");
        return "Hai";
    }
}
