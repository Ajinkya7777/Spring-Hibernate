package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Customer;
import com.durgasoft.entity.Employee;
import com.durgasoft.entity.Person;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;
		try {
			System.out.println("cfg");
			cfg = new Configuration().configure("/com/durgasoft/resources/hibernate.cfg.xml");

			cfg.addAnnotatedClass(Person.class).addAnnotatedClass(Employee.class).addAnnotatedClass(Customer.class);
			
			System.out.println("sf");
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();

			Employee emp = new Employee();
			emp.setEid("111");
			emp.setSal(5000);
			emp.setPaddr("Latur");
			emp.setPname("Aj");

			Customer customer = new Customer();
			customer.setCid("222");
			customer.setMobileNo("7972972299");
			customer.setPaddr("Hyd");
			customer.setPname("Pj");

			tc = session.beginTransaction();
			session.save(customer);
			System.out.println("customer inserted!");
			session.save(emp);
			System.out.println("employee inserted!");

			//int pk1 = (int) session.save(customer);
			//int pk2 = (int) session.save(emp);

			tc.commit();

		} catch (Exception e) {
			System.out.println("Failure in insertion!");
			tc.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
