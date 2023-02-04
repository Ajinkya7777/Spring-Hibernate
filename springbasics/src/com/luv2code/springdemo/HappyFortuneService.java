package com.luv2code.springdemo;

public class HappyFortuneService implements ForturneService {

	@Override
	public String getFortune() {
		return " Today is your lucky day!";
	}

}
