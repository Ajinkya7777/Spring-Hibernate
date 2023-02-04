package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;



public class MethodReplacerTest {
	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		BankService service = cxt.getBean("bankService",BankService.class);
		
		System.out.println(service.getClass()+" " +service.getClass().getSuperclass()+" "+Arrays.toString(service.getClass().getDeclaredMethods()));
		
		System.out.println(" Interest amount: "+service.calInterestAmount());
		
		cxt.close();
		
	
	}
}
