package com.nt.voter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//in this example we used all of the approches for spring bean life cycles 
// 1) using custom methods and xml cfgs            (this approach is non invansive  but custom method needs to be cfgs in xml file)
// 2)  implementing spring bean life cycle methods  (this approach is invansive as we must need to implment methods from spring boot)
// 3) using annotations                              (this  approach is non-invansive as we only need to add annotation over the custom methods)

public class VoterTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		   VotingElligibilityCheck voter = cxt.getBean("voter",VotingElligibilityCheck.class);
		   
		   System.out.println(voter.checkingVoting()); 
		   
		cxt.close();
	}
}
