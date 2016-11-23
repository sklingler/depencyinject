package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.services.factoried.SecondHelloWorldService;

@Controller()
public class GreetingControllerFactoryUser {
	
	@Autowired
	private SecondHelloWorldService svc;
	
	@Autowired 
	@Qualifier("secondHelloWorldGermanImpl")
	SecondHelloWorldService svcDeutch;
	
	
	public String sayHello2() {
		String greet =  svc.getGreeting2();
		System.out.println("Factoried Controller says greeting  = " + greet);
		
		System.out.println("Factoried qualified ref German = " + svcDeutch.getGreeting2());
		return greet;
	}
}
