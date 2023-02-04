package com.nt.test;
import NIT.com.nt.SetterInjection.*;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;



public class HelloWorldMain {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		HelloWorldUsingSetterInjection hello = factory.getBean("msg1",HelloWorldUsingSetterInjection.class);
		
				System.out.println(hello.getMessage());
		
	}
}
