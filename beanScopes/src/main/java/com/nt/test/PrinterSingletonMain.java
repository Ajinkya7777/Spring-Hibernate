package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.scopes.PrinterSingelton;

public class PrinterSingletonMain {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("com/nt/cfgs/applicationContextSingleton.xml");
		  //create objects using factory now
			 PrinterSingelton p1= factory.getBean("printer1",PrinterSingelton.class);
			 PrinterSingelton p2= factory.getBean("printer1",PrinterSingelton.class);
			 
			 System.out.println("Hashcodes : " +p1.hashCode()+" "+p2.hashCode());
			 
			 System.out.println("p1==p2 "+(p1==p2));
			 
			 System.out.println("=====================================");
			 
			 PrinterSingelton p3= factory.getBean("printer2",PrinterSingelton.class);
			 PrinterSingelton p4= factory.getBean("printer2",PrinterSingelton.class);
			 
			 System.out.println("Hashcodes : " +p3.hashCode()+" "+p4.hashCode());
			 
			 System.out.println("p3==p4 "+(p3==p4));

			 
		  
	}
}
