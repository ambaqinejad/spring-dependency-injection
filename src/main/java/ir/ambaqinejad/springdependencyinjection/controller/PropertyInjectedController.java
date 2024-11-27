package ir.ambaqinejad.springdependencyinjection.controller;

import ir.ambaqinejad.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
