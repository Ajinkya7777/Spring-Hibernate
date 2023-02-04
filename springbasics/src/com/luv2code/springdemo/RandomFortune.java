package com.luv2code.springdemo;

public class RandomFortune implements ForturneService {

	@Override
	public String getFortune() {
		
		String[] fortunes= new String[3];
		fortunes[0]="Make your luck keep going!";
		fortunes[1]="Your wish will be granted!";
		fortunes[2]="Always be kind!";
		 int random = (int)(Math.random()*3);
		 System.out.println("random "+random);
		return fortunes[random];
	}

}
