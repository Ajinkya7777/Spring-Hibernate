package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Card;
import com.durgasoft.entity.Cheque;
import com.durgasoft.entity.Payment;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;
		try {
			cfg = new Configuration().configure("/com/dugasoft/resources/hibernate.cfg.xml");

			cfg.addAnnotatedClass(Payment.class).addAnnotatedClass(Cheque.class).addAnnotatedClass(Card.class);

			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();

			Cheque cheque = new Cheque();
			cheque.setTid(1);
			cheque.setpAmt("2000");
			cheque.setpDate("12/12/12");
			cheque.setAccNo("12345");
			cheque.setcNo("B23995J");

			Card card = new Card();
			card.setTid(2);
			card.setpAmt("5000");
			card.setpDate("13/12/12");
			card.setCardExp("12/12/27");
			card.setCardNo(4444);

			tc = session.beginTransaction();

			int pk1 = (int) session.save(cheque);
			System.out.println("Cheque payment done!");
			int pk2 = (int) session.save(card);
			System.out.println("Card payment done!");

			tc.commit();

		} catch (Exception e) {
			tc.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
