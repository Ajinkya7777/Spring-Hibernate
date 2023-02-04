package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class Test {

	public static void main(String[] args) {

		// Configuration cfg = null;
		SessionFactory sf = null;
		Transaction tcx = null;
		Session session = null;

		try {
			Configuration cfg = new Configuration();

			cfg.configure("hibernate.cfg.xml");

			cfg.addAnnotatedClass(Employee.class);

			sf = cfg.buildSessionFactory();

			session = sf.openSession();

			tcx = session.beginTransaction();

			Employee emp = new Employee(2, "bbb", 3000, "Hyd");

			//int e = (Integer) 
					
					session.save(emp);

			tcx.commit();

//			if (emp.geteNo() == e) {
//				System.out.println("Record inserted Successfully!");
//			} else {
//				System.out.println("Record not inserted!");
//			}

		} catch (Exception e) {
			//tcx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}

	}
}
