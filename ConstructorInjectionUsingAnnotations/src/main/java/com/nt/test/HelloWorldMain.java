package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import NIT.com.nt.SetterInjection.HelloWorldUsingSetterInjection;



@SuppressWarnings("unused")
public class HelloWorldMain {
	
	public static void main(String[] args) {	
		
		//Bean factory conatainer does not support the annotations based development
		
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		//reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//		reader.loadBeanDefinitions("applicationContext.xml");
//		System.out.println("Nothing to show");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorldUsingSetterInjection hello = ctx.getBean("msg1",HelloWorldUsingSetterInjection.class);
		

		System.out.println(hello.getMessage());
				
				ctx.close();
		
	}
}
