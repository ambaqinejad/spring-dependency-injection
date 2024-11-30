package ir.ambaqinejad.springdependencyinjection.services.i18n;

import ir.ambaqinejad.springdependencyinjection.services.GreetingService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world. EN";
    }

    @PostConstruct
    public void init() {
        System.out.println("EnglishGreetingService PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("EnglishGreetingService PreDestroy");
    }
}
