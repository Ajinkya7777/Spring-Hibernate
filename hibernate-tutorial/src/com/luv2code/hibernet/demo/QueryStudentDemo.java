package com.luv2code.hibernet.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start the transaction
			session.beginTransaction();

			// query the students
			List<Student> listOfStudents = session.createQuery("from Student").getResultList();

			// display the students
			/*
			 * for (Student s : listOfStudents) { System.out.println(s); }
			 */

			displayStudents(listOfStudents);

			// query the students whose last name: Walker
			listOfStudents = session.createQuery("from Student s where s.lastName='Walker'").getResultList();

			// display the students
			System.out.println();
			System.out.println("Students Who have last name of Walker");
			displayStudents(listOfStudents);

			// query the student whose last name : walker or FirstName : Paul
			listOfStudents = session.createQuery("from Student s where s.lastName='Walker' OR s.firstName='Paul'")
					.getResultList();

			// display the students
			System.out.println("\n\n students who are having last name Walker or First Name as Paul are :");
			displayStudents(listOfStudents);

			// query the students who are having mail id is "%luv2code.com"
			listOfStudents = session.createQuery("from Student s where " + "s.email LIKE '%luv2code.com'")
					.getResultList();

			// display the students
			System.out.println("\n\n students are having the mail id luv2code.com");
			displayStudents(listOfStudents);

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void displayStudents(List<Student> listOfStudents) {
		listOfStudents.stream().forEach(s -> System.out.println(s));
	}
}
