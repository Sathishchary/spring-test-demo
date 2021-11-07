package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		//retrive the bean from spring container
		
		Coach theCoach = context.getBean("Coach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		// close
		context.close();
	
	}

}
