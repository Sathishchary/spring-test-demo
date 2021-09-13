package com.demo.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today Is your lucky day";
	}

}
