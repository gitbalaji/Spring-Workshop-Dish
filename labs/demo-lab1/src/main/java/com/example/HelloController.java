package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello DISH!";
    }

    @RequestMapping("/greeting")
    public Greeting greet() {
        return new Greeting("Hello", "DISH", true);
    }

}
