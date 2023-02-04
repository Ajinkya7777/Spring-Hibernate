package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	
	private ForturneService fortuneService;
	private String nameOfTheCoach;
	private String teamName;
	
	public FootballCoach(ForturneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		//this.nameOfTheCoach=this.getNameOfTheCoach();
		//this.teamName=this.getNameOfTheCoach();
	}
	
//	  public void setNameOfTheCoach(String nameOfTheCoach) {
//		  System.out.println(" Setter for name of the coach");
//		this.nameOfTheCoach = nameOfTheCoach;
//	}
//	  
//	  public void setTeamName(String teamName) {
//		  System.out.println(" Setter for te");
//		this.teamName = teamName;
//	}
//	  
//	  public String getNameOfTheCoach() {
//		return nameOfTheCoach;
//	}
//	  
//	  public String getTeamName() {
//		return teamName;
//	}

	public String getNameOfTheCoach() {
		return nameOfTheCoach;
	}

	public void setNameOfTheCoach(String nameOfTheCoach) {
		this.nameOfTheCoach = nameOfTheCoach;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkout() {

	return "Dribble 20 times";
			
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
