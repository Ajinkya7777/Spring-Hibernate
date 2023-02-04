package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
      private ForturneService fortunateService;
      
      //Setter method for injection
	public void setFortunateService(ForturneService fortunateService) {
		this.fortunateService = fortunateService;
	}

	@Override
	public String getDailyWorkout() {
	
		return " Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortunateService.getFortune();
	}

}
