package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class CricketerTest {
	
	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Cricketer ckt = cxt.getBean("cricketer",Cricketer.class);
		
		ckt.batting();
		ckt.bowling();
		ckt.fielding();
		ckt.wicketKeeping();
		ckt.batting();
		
		cxt.close();
			
	}
}
