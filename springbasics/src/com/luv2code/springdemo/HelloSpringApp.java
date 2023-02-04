package com.luv2code.springdemo;

import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableSpringConfigured
public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container

		// Coach theCoach= context.getBean("myCoach", Coach.class);

		// Coach theCoach= context.getBean("myCoach", Coach.class);
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getClass() + " : " + theCoach.getDailyWorkout());

		// call the fortunate method
		System.out.println(" Fortune Sevice: " + theCoach.getDailyFortune());

		// calling the getters

		// System.out.println(theCoach.getNameOfTheCoach());
		// System.out.println(theCoach.getTeamName());
		// System.out.println(theCoach.getNameOfTheCoach()); //unable to call the
		// getters by using interface reference ,
		// i've to swich back to fooball coach
		// System.out.println(theCoach.getTeamName());

		// close the context
		context.close();
	}

}
