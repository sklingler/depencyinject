package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.controllers.GreetingController;
import com.example.controllers.GreetingControllerFactoryUser;

/*
 * Added ComponentScan to account for us moving the application class (what Boot calls) to another package.
 */
@SpringBootApplication
@ComponentScan({"com.example"})
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		GreetingController controller = (GreetingController)ctx.getBean("greetingController");
		controller.sayHello();
		
		GreetingControllerFactoryUser fController = (GreetingControllerFactoryUser)ctx.getBean("greetingControllerFactoryUser");
		fController.sayHello2();
	}
}
