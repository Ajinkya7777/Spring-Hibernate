package com.nt.voter;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@PropertySource("com/nt/commons/application.properties")
public class VotingElligibilityCheck implements InitializingBean, DisposableBean {

	// @Value("${voter.name}")
	private String name;
	// @Value("${voter.address}")
	private String address;
	// @Value("${voter.age}")
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

	public void init() {

		// this is 1st approch using xml cfgs and our own custom methods
		System.out.println("VotingElligibilityCheck.init()");
		verfiedOn = new Date();
		if (address == null) {
			address = "Not Provided";
		} else if (name == null) {
			throw new IllegalArgumentException("Name should be there");
		} else if (age == 0) {
			throw new IllegalArgumentException("Age is not valid");
		}
	}

	public void inDestroy() {
		// this is 1st approch using xml cfgs and our own custom methods
		System.out.println("VotingElligibilityCheck.inDestroy()");
		name = null;
		age = 0;
		address = null;
		verfiedOn = null;

	}

	public String checkingVoting() {

		if (age < 18) {

			return name + " is " + age + " years old, lives in " + address
					+ " is not elligible for voting . checked on " + verfiedOn;
		} else {
			return name + " is " + age + " years old, lives in " + address + " is elligible for voting. checked on "
					+ verfiedOn;
		}
	}

	public void afterPropertiesSet() throws Exception {
		// this method is for 2nd approch implementing the spring interfaces of spring
		// bean life cycle
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

	public void destroy() {
		// this method is for 2nd approch implementing the spring interfaces of spring
		// bean life cycle
		System.out.println("VotingElligibilityCheck.destroy()");
		name = null;
		age = 0;
		address = null;
		verfiedOn = null;
	}

	@PostConstruct
	public void customInIt() throws Exception {
		// this is annotations approch
		System.out.println("VotingElligibilityCheck.customInIt()");
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
		// this is annotations approch
		System.out.println("VotingElligibilityCheck.customDestroy()");
		name = null;
		age = 0;
		address = null;
		verfiedOn = null;
	}

}
