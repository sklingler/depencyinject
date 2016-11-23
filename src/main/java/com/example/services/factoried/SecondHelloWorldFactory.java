package com.example.services.factoried;

public class SecondHelloWorldFactory {
	   public SecondHelloWorldService createHelloWorldService(String language){
		   SecondHelloWorldService service = null;

	        switch (language){
	            case "en":
	                service = new SecondHelloWorldEnglishImpl();
	                break;
	            case "es":
	                service = new SecondHelloWorldSpanishImpl();
	                break;
	            case "fr":
	                service = new SecondHelloWorldFrenchImpl();
	                break;
	            case "de":
	                service = new SecondHelloWorldGermanImpl();
	                break;
	            case "pl":
	                service = new SecondHelloWorldPolishImpl();
	                break;
	            case "ru":
	                service = new SecondHelloWorldRussianImpl();
	                break;
	            default: new SecondHelloWorldEnglishImpl();
	        }

	        return service;
	    }
}
