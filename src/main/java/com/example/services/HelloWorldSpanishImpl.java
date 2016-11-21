package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
// The active profile is configured in application.properties!
@Profile("spanish")
public class HelloWorldSpanishImpl implements HelloWorldService {

	@Override
	public String getGreeting() {
		return "Hola Senor";
	}

}
