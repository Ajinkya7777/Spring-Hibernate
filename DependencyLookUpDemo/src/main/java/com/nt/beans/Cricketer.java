package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component ("cricketer")
@Lazy
public class Cricketer {
	
	public Cricketer() {
		
		System.out.println("Cricketer:: 0-param-constructor");
	}
	
	public void bowling() {
		
		System.out.println(" Cricketer is bowling");
	}
	
	public void batting() {
		
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Bat bat = cxt.getBean("bat",Bat.class);
		
		
		
		System.out.println(" Cricketer is batting and he scored "+bat.runsScored()+" runs");
	}
	
	public void wicketKeeping() {
		
		System.out.println(" Cricketer is keeping wickets");
	}
	public void fielding() {
		System.out.println(" Cricketer is fielding");
	}

}
