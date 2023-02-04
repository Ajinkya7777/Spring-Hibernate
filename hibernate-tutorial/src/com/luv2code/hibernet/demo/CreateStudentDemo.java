package com.luv2code.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {
			// use the session object to save the java object

			// create a student object
			System.out.println("Creating the Student object");
			Student tempStudent = new Student("DAffy", "Duck", "dd@luv2code.com");

			// start the transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student object....");

			session.save(tempStudent);

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
