package ir.ambaqinejad.springdependencyinjection.controller;

import ir.ambaqinejad.springdependencyinjection.services.GreetingService;
import ir.ambaqinejad.springdependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("Inside controller");
        return greetingService.sayGreeting();
    }
}
