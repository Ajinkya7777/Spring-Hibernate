
package com.durgasoft.test;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee1;
import com.durgasoft.entity.Employee2;

public class TestInsert {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/durgasoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee1.class).addAnnotatedClass(Employee2.class);
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			tc = session.beginTransaction();

			Query query = session.createQuery(
					"Insert into Employee1 (eno,ename,salary,address)select e.eno,e.ename,e.salary,e.address from Employee2 as e");

			int resultSet = query.executeUpdate();
			tc.commit();
			System.out.println("No of Employee's Inserted :" + resultSet);

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
