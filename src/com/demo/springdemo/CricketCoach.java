package com.demo.springdemo;

public class CricketCoach implements Coach {

	// added fields for email, team
	private String emailAddress;
	private String team;
	public FortuneService fortuneService;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("we are in cricket coach : setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("we are in cricket coach : setTeam");
		this.team = team;
	}
	
	public CricketCoach() {
		System.out.println("we are in cricket coach : no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket coach set fortune service");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "cricket is good game !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
