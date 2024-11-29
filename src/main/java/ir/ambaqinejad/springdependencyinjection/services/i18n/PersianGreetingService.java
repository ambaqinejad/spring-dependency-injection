package ir.ambaqinejad.springdependencyinjection.services.i18n;

import ir.ambaqinejad.springdependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FA")
@Service("i18NService")
public class PersianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "سلام دنیا فارسی";
    }
}
