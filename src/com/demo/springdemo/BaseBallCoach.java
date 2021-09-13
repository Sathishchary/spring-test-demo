package com.demo.springdemo;

public class BaseBallCoach implements Coach {
    
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// create the constructor for dependency injection
	
	BaseBallCoach(FortuneService newfortuneService){
		fortuneService = newfortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "spend 30 mints time on batting field";
	}

	@Override
	public String getDailyFortune() {
		// user fortune service to get fortune method
		return fortuneService.getFortune();
	}
	
}
