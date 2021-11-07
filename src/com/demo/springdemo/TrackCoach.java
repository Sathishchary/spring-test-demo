package com.demo.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		 System.out.println(" track coach default constructor");
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Run 2k in 5 mints";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it" + fortuneService.getFortune();
	}
	
	// add init method
	 public void getMyMethod() {
		 System.out.println("custom method print track coach");
	 }
	
	// add a destroy method
	 public void getMyMethodDestroy() {
		 System.out.println("custom method Destroy print track coach");
	 }
	

}
