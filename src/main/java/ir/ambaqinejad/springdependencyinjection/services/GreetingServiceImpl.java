package ir.ambaqinejad.springdependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from GreetingService!" ;
    }
}
