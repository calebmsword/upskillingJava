package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class OtherController {
    @GetMapping("")
    public String hello() {
        return "inside of GET method";
    }

    @PostMapping("")
    public String helloPost() {
        return "inside of POST method";
    }

    @PutMapping("")
    public String helloPut() {
        return "inside of PUT method";
    }

    @DeleteMapping("")
    public String helloDelete() {
        return "inside of DELETE method";
    }

    @GetMapping("/{name}/{tech}")
    public String helloGet(@PathVariable String name, @PathVariable String tech) {
        return "Inside of another GET.\n"+"name is: "+name+", tech is: "+tech;
    }
}
