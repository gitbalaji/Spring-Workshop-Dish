package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(GreeterSettings.class)
@RestController
public class HelloController {
    @Autowired
    private GreeterSettings greeterSettings;

    @RequestMapping("/")
    public String sayHello() {
        return String.format("Hello %s!", greeterSettings.getName());
    }

    @RequestMapping("/greeting")
    public Greeting greet() {
        return new Greeting("Hello", "DISH", true);
    }

}
