package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class Test {
	static Transaction tcx = null;
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		
		Session session = null;
		try {
			cfg = new Configuration().configure().addAnnotatedClass(Employee.class);

			factory = cfg.buildSessionFactory();
			System.out.println(factory);
			session = factory.openSession();

			tcx = session.beginTransaction();

			Employee e = new Employee(7, "Sun", 12000,"Spain");

			int pk = (Integer) session.save(e);
			if (pk == 6) {
				System.out.println("Record inserted Successfully!");
			}
			tcx.commit();

		} catch (Exception e) {
			System.out.println("Record not inserted!");
			tcx.rollback();
			e.printStackTrace();
		} finally {
			 session.close();
			 factory.close();
		}
	}
}
