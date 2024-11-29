package ir.ambaqinejad.springdependencyinjection.controller;

import ir.ambaqinejad.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

//    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        System.out.println("setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
