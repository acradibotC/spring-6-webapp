package acradibotc.springframework.spring6di;

import acradibotc.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main method");

        System.out.printf(controller.sayHello());
    }

}
