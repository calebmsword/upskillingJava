package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/yeet")
    public String home() {
        System.out.println("hello");
        return "home.jsp";
    }
}
