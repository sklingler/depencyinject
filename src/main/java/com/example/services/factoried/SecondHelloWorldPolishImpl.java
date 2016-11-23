package com.example.services.factoried;

import org.springframework.stereotype.Component;

@Component
public class SecondHelloWorldPolishImpl implements SecondHelloWorldService {
	@Override
	public String getGreeting2() {
		return  "(factoried) Witaj świecie";
	}

}
