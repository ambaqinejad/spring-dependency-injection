package ir.ambaqinejad.springdependencyinjection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Inside controller");
        return "Hello World";
    }
}
