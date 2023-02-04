
package com.durgasoft.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee1;

public class TestInsert {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/durgasoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee1.class);
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();

			//Query query = session.createQuery("from Employee1 where etype='perm'");
			Filter filter = session.enableFilter("empType");
				filter.setParameter("salary",6000);
				
				Query query = session.createQuery("from Employee1");

			List<Employee1> list = query.getResultList();

			list.stream().forEach(s -> System.out.println(s));

		} catch (Exception e) {
			System.out.println("Failure!");
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();

		}
	}
}
