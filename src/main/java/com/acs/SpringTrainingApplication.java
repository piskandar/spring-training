package com.acs;

import com.acs.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTrainingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringTrainingApplication.class, args);

		GreetingController greetingController = (GreetingController)context.getBean("greetingController");
		greetingController.sayHello();
	}
}
