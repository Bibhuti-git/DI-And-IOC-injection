package com.greatlearning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SportsCoach spCoach = ctx.getBean("cricketCoach",SportsCoach.class);
		System.out.println("The timing is"+ spCoach.GetTrainingSchedule());
	

	}

}
