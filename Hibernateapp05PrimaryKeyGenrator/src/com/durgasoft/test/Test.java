package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;
		try {
			cfg = new Configuration().configure("/com/durgasoft/resources/hibernate.cfg.xml");
//			cfg = new Configuration().configure();

			cfg.addAnnotatedClass(Employee.class);

			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			tc = session.beginTransaction();

//			Employee emp = new Employee()	;
//				emp.seteNo(3);
//					
//				session.delete( emp);

			Employee emp = new Employee("AAA", "HYD", 5000);
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
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
