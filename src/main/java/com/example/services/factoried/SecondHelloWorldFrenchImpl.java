package com.example.services.factoried;

import org.springframework.stereotype.Component;

import com.example.services.HelloWorldService;

@Component
public class SecondHelloWorldFrenchImpl implements SecondHelloWorldService{
	@Override
	public String getGreeting2() {
		return  "(factoried) Bonjour Monsieur";
	}

}
