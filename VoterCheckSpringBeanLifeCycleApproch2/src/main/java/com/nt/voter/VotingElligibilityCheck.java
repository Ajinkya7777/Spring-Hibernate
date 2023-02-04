package com.nt.voter;

import java.util.Date;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingElligibilityCheck implements InitializingBean, DisposableBean {

	private String name;
	private String address;
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
	public void afterPropertiesSet() throws Exception {
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

	public void destroy() throws Exception {

		System.out.println("VotingElligibilityCheck.destroy()");
		name = null;
		age = 0;
		address = null;
		verfiedOn = null;
	}

}
