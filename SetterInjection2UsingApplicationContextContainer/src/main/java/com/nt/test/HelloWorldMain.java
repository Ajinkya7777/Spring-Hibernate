package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import NIT.com.nt.SetterInjection.HelloWorldUsingSetterInjection;



public class HelloWorldMain {
	
	public static void main(String[] args) {	
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
//		reader.loadBeanDefinitions("applicationContext.xml");
//		System.out.println("Nothing to show");
		
		//below we used (line no 19)  the filesystemxmlapplicationcontext container to create the IOC container which will take file path which 
		// not recommended bcz needs to path whole file path i.e. absolute path " src/main/java/com/nt/cfgs/applicationContext/xml "
		
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		
		//below we used (line no 27) classpathxmlapplicationcontext container to create the Spring IOC container which is recommended . bcz we dont need
		// put full path while passing arguments bcz src/main/java is already present in build path .
		//recommended bcz need to path relative path only i.e. com/nt/cfgs/applicationContext.xml
		
		
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//below we added (line no 33)  the com.nt.cfgs to the source folder directly to build path so that we don't need to pass the source folder
		// we can only pass the file name only and it will take it /
		//how to add the folder to build path ==> right click on pkg and then goto build path and then add to build path. ( use as a source folder)
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorldUsingSetterInjection hello = ctx.getBean("msg1",HelloWorldUsingSetterInjection.class);
		

		System.out.println(hello.getMessage());
				
				ctx.close();
		
	}
}
