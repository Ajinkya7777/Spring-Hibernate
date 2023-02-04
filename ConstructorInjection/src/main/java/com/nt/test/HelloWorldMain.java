package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.ConstructorInjection.*;



public class HelloWorldMain {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		HelloWorldUsingConstructorInjection hello = factory.getBean("msg1",HelloWorldUsingConstructorInjection.class);
		
				System.out.println(hello.getMessage());
		
	}
}
