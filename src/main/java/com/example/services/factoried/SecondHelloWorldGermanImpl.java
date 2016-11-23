package com.example.services.factoried;

import org.springframework.stereotype.Component;

@Component
public class SecondHelloWorldGermanImpl implements SecondHelloWorldService {
	@Override
	public String getGreeting2() {
		return  "(factoried) Hallo Fraulein";
	}

}
