package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
// The active profile is configured in application.properties!
//@Profile("english")
@Profile({"default","english"})
public class HelloWorldServiceEngImpl implements HelloWorldService {

	@Override
	public String getGreeting() {
		return "(English)Hello World";
	}

}
