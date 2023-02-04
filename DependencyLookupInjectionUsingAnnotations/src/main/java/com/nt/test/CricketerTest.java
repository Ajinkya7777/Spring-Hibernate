package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class CricketerTest {
	
	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cricketer ckt = cxt.getBean("cricketer",Cricketer.class);
		
		System.out.println(ckt.getClass()+" " +ckt.getClass().getSuperclass()+" "+Arrays.toString(ckt.getClass().getDeclaredMethods()));
		
		ckt.batting();
		ckt.batting();
		ckt.bowling();
		ckt.fielding();
		ckt.wicketKeeping();
		
		cxt.close();
		
		
			
	}
}
