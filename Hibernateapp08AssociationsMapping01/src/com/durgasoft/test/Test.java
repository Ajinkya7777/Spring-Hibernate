package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Account;
import com.durgasoft.entity.Employee;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;

		try {

			cfg = new Configuration().configure("/com/durgosoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Account.class).addAnnotatedClass(Employee.class);

			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			tc = session.beginTransaction();

			Account account = new Account();
			account.setAccNo(111);
			account.setAccType("Savings");
			account.setBalance(5000);

			Employee emp = new Employee();
			emp.seteId(111);
			emp.seteName("AAA");
			emp.setAccount(account);

			session.save(emp);
			System.out.println("Employee inserted successfully!");
			tc.commit();

		} catch (Exception e) {
			System.out.println("Employee could not be inserted!");
			tc.rollback();
			e.printStackTrace();
		} finally {

		}

	}
}
