package com.nt.test;
import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import NIT.com.nt.SetterInjection.HelloWorldUsingSetterInjection;



@SuppressWarnings("unused")
public class HelloWorldMain {
	
	public static void main(String[] args) {	
		
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Count " +ctx.getBeanDefinitionCount());
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		
		HelloWorldUsingSetterInjection hello = ctx.getBean("TargetMessage",HelloWorldUsingSetterInjection.class);
		
		
		
		
	//System.out.println(hello.getMessage());
				
				ctx.close();
		
	}
}
