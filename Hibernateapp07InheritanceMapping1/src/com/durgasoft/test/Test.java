package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;
import com.durgasoft.entity.Student;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;
		try {
			System.out.println("creating configuration object");
			cfg = new Configuration().configure("/com/dugasoft/resources/hibernate.cfg.xml");

			cfg.addAnnotatedClass(Student.class).addAnnotatedClass(Employee.class);

			System.out.println("creating sessionn factory object");
			sessionFactory = cfg.buildSessionFactory();
			System.out.println("session factory " + sessionFactory);
			System.out.println("creating session object");
			session = sessionFactory.openSession();
			// tc = session.beginTransaction();

			Student std = new Student();
			std.setMarks(99);
			std.setName("BBB");
			std.setAddrs("Jaipur");
			std.setAccName("SV");
			std.setAccNo("333");
			std.setAccType("Saving");

//			Employee emp = new Employee();
//
//			emp.setEAddrs("HYD");
//			;
//			emp.seteId("222");
//			emp.setSal(2222);
//			emp.setAccName("pj");
//			emp.setAccNo("222");
//			emp.setAccType("Saving");

			System.out.println("beginning transactions");
			tc = session.beginTransaction();

			// session.save(emp);
			session.save(std);

			tc.commit();

		} catch (Exception e) {
			tc.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
