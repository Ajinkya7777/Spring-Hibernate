package com.nt.test;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;
public class RealtimeDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); //14 and 15 lines are there for creating spring ioc container.
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get springBean class obj ref
		
		MainController controller = factory.getBean("controller",MainController.class);
		
		//read inputs as string values and stores them into employeeVO class object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		 
		String name = scan.next();
		System.out.println(" enter employee desg: ");
		String desg = scan.next();
		
		System.out.println("enter the employee's basic salary: ");
		String basicSalary= scan.next();
		
		EmployeeVO vo = new EmployeeVO()	;
		vo.seteName(name);
		vo.setDesg(desg);
		vo.setBasicSalary(basicSalary);
		//invoke methods
		try {
			String result= controller.processEmployee(vo);
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
