package ir.ambaqinejad.springdependencyinjection.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("FA")
@SpringBootTest
class Myi18NControllerTestFA {

    @Autowired
    private Myi18NController myi18NController;

    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
    }

}