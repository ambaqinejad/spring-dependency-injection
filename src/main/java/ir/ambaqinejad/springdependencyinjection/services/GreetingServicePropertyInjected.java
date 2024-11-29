package ir.ambaqinejad.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "GreetingServicePropertyInjected";
    }
}
