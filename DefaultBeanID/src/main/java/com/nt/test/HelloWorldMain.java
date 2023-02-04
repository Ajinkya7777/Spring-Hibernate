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
		
		HelloWorldUsingSetterInjection hello = ctx.getBean("NIT.com.nt.SetterInjection.HelloWorldUsingSetterInjection#0",HelloWorldUsingSetterInjection.class);
		HelloWorldUsingSetterInjection hello1 = ctx.getBean("NIT.com.nt.SetterInjection.HelloWorldUsingSetterInjection#1",HelloWorldUsingSetterInjection.class);
		
		System.out.println("Count of BEAN id's = "+ctx.getBeanDefinitionCount()); // to get the no of bean id's created by IOC container
		System.out.println(" \nBean id's are :" +Arrays.toString(ctx.getBeanDefinitionNames())); //to get the names of the bean id's created by IOC container
		
		
		
		System.out.println(hello.getMessage());
				
				ctx.close();
				
	//when we dont give any bean id while cgf's then we will get defalut names like "NIT.com.nt.SetterInjection.HelloWorldUsingSetterInjection#0"
	//for every bean creation . and we create another bean id that means #1,#2, and so on.....
		
	}
}
