package ir.ambaqinejad.springdependencyinjection;

import ir.ambaqinejad.springdependencyinjection.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

}
