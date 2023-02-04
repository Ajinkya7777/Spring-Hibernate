package com.durgasoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class TestSelect {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/durgasoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
//====================================retrieving the single column from database=========================================		
			
			/*
			 * Query query = session.createQuery("select salary from Employee");
			 * 
			 * System.out.println("using getResultList()");
			 * 
			 * List<Integer> salary = query.getResultList();
			 * salary.stream().forEach(s->System.out.println(s));
			 */
//=====================================retrieving multiple columns from database=========================================			
			
			Query query = session.createQuery("select eno,ename,salary from Employee");

			System.out.println("using getResultList()");
			
			List<Object[]> object =  query.getResultList();
			
			for (Object[] object2 : object) {
				System.out.println(Arrays.toString(object2));
				
			}
				
			
			//List<Employee> emps = (List<Employee>) object;
			
			//object.stream().forEach(s->System.out.println(s));
			
//==============================================retrieving the all columns from database=============================
			
			//List<Employee> employees = (List<Employee>) query.getResultList();
			//employees.stream().forEach(s -> System.out.println(s));
			
			
//=====================================================used for single record ===========================================
//			System.out.println("using getSingleResult()"); // used to retrieve only single record
//
//			Employee emp = (Employee) query.getSingleResult();
//			System.out.println(emp);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();

		}
	}
}
