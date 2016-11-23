package com.example.services.factoried;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class SecondHelloWorldSpanishImpl implements SecondHelloWorldService {
	@Override
	public String getGreeting2() {
		return  "(factoried) Hola Copa!";
	}

}
