package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("cricketer")
//@Lazy
public abstract class Cricketer {
	private ApplicationContext cxt;

	public Cricketer() {

		System.out.println("Cricketer:: 0-param-constructor");
	}

	public abstract Bat createBat();

//	public void setApplicationContext(ApplicationContext cxt) throws BeansException {
//
//		System.out.println("Cricketer.setApplicationContext()");
//
//		this.cxt = cxt;
//	}

	public void bowling() {

		System.out.println(" Cricketer is bowling");
	}

	public void batting() {

		// instead of creating new ApplicationContext container we implemented
		// setApplicationContext interface , container will call that
		// method and give us object of applicationContext and using that we will get
		// the dependent class object easily by calling
		// getBean() method in this case dependent class object is Bat .

		// ClassPathXmlApplicationContext cxt = new
		// ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//		Bat bat = cxt.getBean("bat",Bat.class);

		Bat bat = this.createBat(); // calling the abstract method which gives me the Bat class obj (Dependant class Object)
									

		System.out.println(" Cricketer is batting and he scored " + bat.runsScored() + " runs");
	}

	public void wicketKeeping() {

		System.out.println(" Cricketer is keeping wickets");
	}

	public void fielding() {
		System.out.println(" Cricketer is fielding");
	}

}
