package com.luv2code.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		
		// create session factory

				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
						.buildSessionFactory();

				// create session

				Session session = factory.getCurrentSession();

				try {
					// use the session object to save the java object

					// create 3 student object
					System.out.println("Creating the Student object");
					Student tempStudent1 = new Student("Pall", "joker", "pj@luv2code.com");
					Student tempStudent2 = new Student("Paul", "Walker", "pw@luv2code.com");
					Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

					// start the transaction
					session.beginTransaction();

					// save the student object
					System.out.println("Saving the students ....");

					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);

					// commit the transaction
					session.getTransaction().commit();
					System.out.println("Done!");
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
}
