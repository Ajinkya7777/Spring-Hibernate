
package com.durgasoft.test;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class TestDelete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/durgasoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			tc = session.beginTransaction();
			Query query = session.createQuery("Delete from Employee as e where e.salary>6000");

			int resultSet = query.executeUpdate();
			tc.commit();
			System.out.println("No of Employee's who are deleted :" + resultSet);

		} catch (Exception e) {
			tc.rollback();
			System.out.println("Failure!");
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();

		}
	}
}
