package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrive the bean from spring container
		
		Coach theCoach = context.getBean("Coach", Coach.class);
		Coach myCoach = context.getBean("Coach", Coach.class);
		
		boolean result = (theCoach == myCoach);
		
		System.out.println("result " + result);
		System.out.println("result of the Coach" + theCoach);
		System.out.println("result of the my Coach" + myCoach);

	}

}
