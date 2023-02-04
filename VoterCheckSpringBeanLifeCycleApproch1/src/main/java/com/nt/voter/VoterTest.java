package com.nt.voter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VoterTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		   VotingElligibilityCheck voter = cxt.getBean("voter",VotingElligibilityCheck.class);
		   
		   System.out.println(voter.checkingVoting()); 
		   
		 cxt.close();
	}
}
