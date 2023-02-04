package com.durgasoft.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.durgasoft.entity.Employee1;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/durgasoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee1.class);
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();

			Criteria c = session.createCriteria(Employee1.class);

			Criterion c1 = Restrictions.gt("salary", 5000);

			c.add(c1);
			Projection p1 = Projections.property("eno");
			Projection p2 = Projections.property("ename");
			Projection p3 = Projections.property("salary");
			Projection p4 = Projections.property("address");

			ProjectionList pl = Projections.projectionList();
			pl.add(p1);
			pl.add(p2);
			pl.add(p3);
			pl.add(p4);

			c.setProjection(pl);

			Order order = Order.desc("ename");
			c.addOrder(order);
			
			List<Object[]> list = c.list();
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("------------------------------");
			for (Object[] objects : list) {
				for (Object objects2 : objects) {
					System.out.print(objects2+"\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Failure!");
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();

		}
	}
}
