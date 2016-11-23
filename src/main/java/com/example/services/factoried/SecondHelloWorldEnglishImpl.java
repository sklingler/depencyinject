package com.example.services.factoried;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"english", "default"})
public class SecondHelloWorldEnglishImpl implements SecondHelloWorldService {

	@Override
	public String getGreeting2() {
		return  "(factoried) Hello World";
	}

}
