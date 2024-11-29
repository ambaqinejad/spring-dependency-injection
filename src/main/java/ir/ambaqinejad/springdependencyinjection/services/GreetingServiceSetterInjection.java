package ir.ambaqinejad.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "GreetingServiceSetterInjection!!!!";
    }
}
