package com.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.services.factoried.SecondHelloWorldFactory;
import com.example.services.factoried.SecondHelloWorldService;

@Configuration
public class HelloConfig {
	@Bean
	public SecondHelloWorldFactory helloWorldFactory(){
        return new SecondHelloWorldFactory();
    }
	
	/*
	 * This bean will be selected whether we have no profile, or it is english. Both beans are primary
	 * means that they will get picked up by the configuration (taking that away will give us the error
	 * that there are too many beans to choose from unless we give each bean a profile too)
	 */
    @Bean
    @Profile({"english","default"})
    @Primary
    public SecondHelloWorldService helloWorldServiceEnglish(SecondHelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public SecondHelloWorldService helloWorldServiceSpanish(SecondHelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }

    @Bean(name = "french")
    public SecondHelloWorldService helloWorldServiceFrench(SecondHelloWorldFactory factory){
        return factory.createHelloWorldService("fr");
    }

    @Bean
    public SecondHelloWorldService helloWorldServiceGerman(SecondHelloWorldFactory factory){
        return factory.createHelloWorldService("de");
    }

    @Bean
    public SecondHelloWorldService helloWorldServicePolish(SecondHelloWorldFactory factory){
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public SecondHelloWorldService helloWorldServiceRussian(SecondHelloWorldFactory factory){
        return factory.createHelloWorldService("ru");
    }	
}
