package com.luv2code.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {
			int studentID = 1;
			// start the transaction
			session.beginTransaction();

			// find out the student's based on the ID : Primary key
			System.out.println("\nGetting student with ID: " + studentID);

			Student myStudent = session.get(Student.class, studentID);

			System.out.println("Updating Student....");

			myStudent.setFirstName("Scooby");

			// commit the transaction
			session.getTransaction().commit();

			// New Code
			// start the transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// update the email for all students
			System.out.println("\n\nUpdate email for all students ");

			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			factory.close();
			e.printStackTrace();
		}
	}
}
