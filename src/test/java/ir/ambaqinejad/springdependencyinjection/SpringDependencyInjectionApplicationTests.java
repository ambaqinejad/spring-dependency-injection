package ir.ambaqinejad.springdependencyinjection;

import ir.ambaqinejad.springdependencyinjection.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringDependencyInjectionApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Autowired MyController controller;

    @Test
    void testAutowiredController() {
        System.out.println(controller.sayHello());
    }

    @Test
    void testGetControllerFromCtx() {
        MyController controller = ctx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
