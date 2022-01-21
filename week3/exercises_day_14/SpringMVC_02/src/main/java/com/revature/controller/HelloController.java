package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "../../index";
    }

    @RequestMapping("hello/{name}/{tech}")
    public ModelAndView hello(@PathVariable("name") String name, @PathVariable("tech") String tech) {
        System.out.println("Name is: "+name);
        System.out.println("Technology is: "+tech);
        String msg = "Name: "+name+", Technology: "+tech;
        ModelAndView modelAndView = new ModelAndView("Hello");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }

    @RequestMapping("hai")
    public String hai() {
        return "Hai";
    }

    @RequestMapping("sus")
    public String sus() {
        return "Sus";
    }

}
