package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		//create IOC container 
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get spring bean class object 
		
	      Class classes = factory.getBean("c1",Class.class);
	      System.out.println("Classes object Name: "+classes.getClass()+" classes object data : "+classes.toString());
	      
	      Calendar cal = factory.getBean("cal",Calendar.class);
	      System.out.println("\ncal object Name: "+cal.getClass()+" cal object data : "+cal.toString());
	      
	      Properties properties = factory.getBean("props",Properties.class);
	      System.out.println("\nproperties object Name: "+properties.getClass()+" properties object data : "+properties.toString());
	      
	      String s = factory.getBean("s2",String.class);
	      System.out.println("\ns object Name: "+s.getClass()+" s object data : "+s.toString());
	      
	      StringBuffer sb = factory.getBean("sbf",StringBuffer.class);                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	      System.out.println("\ns object Name: "+sb.getClass()+" s object data : "+sb.toString());
	      
	      
	}
}
