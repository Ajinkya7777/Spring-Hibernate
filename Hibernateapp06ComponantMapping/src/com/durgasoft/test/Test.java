package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Account;
import com.durgasoft.entity.Address;
import com.durgasoft.entity.Employee;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;
		try {
			
			cfg = new Configuration().configure("/com/durgasoft/resources/hibernate.cfg.xml");

			cfg.addAnnotatedClass(Employee.class);

			sessionFactory = cfg.buildSessionFactory();
			System.out.println("creating configuration object");
			session = sessionFactory.openSession();
			tc = session.beginTransaction();

			Address addrs = new Address("103/503");

			Account acc = new Account(12345);

			Employee emp = new Employee("CCC", "Latur", 16000, acc, addrs);
			int pk = (int) session.save(emp);

			if (pk == emp.geteNo()) {
				tc.commit();
				System.out.println("Record inserted successfully!");
			} else {
				tc.rollback();
				System.out.println("Record not inserted!");
			}

		} catch (Exception e) {
			tc.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
