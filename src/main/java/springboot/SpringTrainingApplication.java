package springboot;

import com.acs.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("com.acs")
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringTrainingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringTrainingApplication.class, args);

		GreetingController greetingController = (GreetingController)context.getBean("greetingController");
		greetingController.sayHello();
	}
}
