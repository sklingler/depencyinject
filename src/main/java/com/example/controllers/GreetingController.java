package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.services.HelloWorldService;

@Controller
//@Component
public class GreetingController {
	
	private HelloWorldService helloWorldSvc;
	
	@Autowired
	public void setHelloWorldSvc(HelloWorldService helloWorldSvc) {
		this.helloWorldSvc = helloWorldSvc;
	}

	public String sayHello() {
		String greet = helloWorldSvc.getGreeting();
		System.out.println("Controller says greeting  = " + greet);
		return greet;
	}

}
