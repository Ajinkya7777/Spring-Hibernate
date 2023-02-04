package com.luv2code.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {
			//int studentID = 1;
			// start the transaction
			session.beginTransaction();

			// find out the student's based on the ID : Primary key
			//System.out.println("\nGetting student with ID: " + studentID);

			//Student myStudent = session.get(Student.class, studentID);
			
			//delete the student
			//System.out.println("\n\nDeleting the student:"+myStudent.getId());
			//session.delete(myStudent);
			
			//deleting the student id with 2
			System.out.println("Deleting the student with ID =2");
			session.createQuery("delete from Student where id=2").executeUpdate();
			System.out.println();

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			factory.close();
			e.printStackTrace();
		}
	}
}
