
package com.durgasoft.test;

import java.util.List;

//import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee1;

@SuppressWarnings("deprecation")
public class Test {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/durgasoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee1.class);
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			// tc = session.beginTransaction();

			// named parameters
			SQLQuery<Employee1> sqlQuery = session
					.createSQLQuery("Select eno,ename,esal,eaddr from emp1 ");

			// positional parameters
			// SQLQuery<Employee1 >sqlQuery = session.createSQLQuery("Select * from emp1
			// where esal > ? And esal< ?");

			//sqlQuery.setParameter("min", 5000); // named parameters
			//sqlQuery.setParameter("max", 7000);

			// sqlQuery.setParameter(1, 5000); //positional parameters
			// sqlQuery.setParameter(2, 7000);

			sqlQuery.addEntity(Employee1.class);

			List<Employee1> emps = sqlQuery.list();
			//ScrollableResults emps = sqlQuery.scroll();
			//System.out.println(emps);
			

			emps.stream().forEach(s -> System.out.println(s));

		} catch (Exception e) {
			System.out.println("Failure!");
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();

		}
	}
}
