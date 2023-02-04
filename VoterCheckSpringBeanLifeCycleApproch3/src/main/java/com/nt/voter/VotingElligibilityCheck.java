package com.nt.voter;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Component("voter")
@PropertySource("com/nt/commons/application.properties")
public class VotingElligibilityCheck  {
	
	@Value("${voter.name}")
	private String name;
	@Value("${voter.address}")
	private String address;
	@Value("${voter.age}")
	private int age;
	private Date verfiedOn;

	public void setName(String name) {
		System.out.println("VotingElligibilityCheck.setName()");
		this.name = name;
	}

	public void setAddress(String address) {
		System.out.println("VotingElligibilityCheck.setAddress()");
		this.address = address;
	}

	public void setAge(int age) {
		System.out.println("VotingElligibilityCheck.setAge()");
		this.age = age;
	}

	/*
	 * public void init() { System.out.println("VotingElligibilityCheck.init()");
	 * verfiedOn = new Date(); if (address==null) { address = "Not Provided"; } else
	 * if (name==null) { throw new IllegalArgumentException("Name should be there");
	 * } else if (age==0) { throw new IllegalArgumentException("Age is not valid");
	 * } }
	 */
	public String checkingVoting() {

		if (age < 18) {

			return name + " is " + age + " years old, lives in " + address
					+ " is not elligible for voting . checked on " + verfiedOn;
		} else {
			return name + " is " + age + " years old, lives in " + address + " is elligible for voting. checked on "
					+ verfiedOn;
		}
	}

	/*
	 * public void destroy() {
	 * System.out.println("VotingElligibilityCheck.destroy()"); name=null; age=0;
	 * address=null; verfiedOn=null; }
	 */
	
	@PostConstruct
	public void customInIt() throws Exception {
		System.out.println("VotingElligibilityCheck.afterPropertiesSet()");
		verfiedOn = new Date();
		if (address == null) {
			address = "Not Provided";
		} else if (name == null) {
			throw new IllegalArgumentException("Name should be there");
		} else if (age == 0) {
			throw new IllegalArgumentException("Age is not valid");
		}

	}
	
	@PreDestroy
	public void customDestroy() throws Exception {

		System.out.println("VotingElligibilityCheck.destroy()");
		name = null;
		age = 0;
		address = null;
		verfiedOn = null;
	}

}
