package ir.ambaqinejad.springdependencyinjection.controller;

import ir.ambaqinejad.springdependencyinjection.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService =
                greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
