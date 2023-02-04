package com.durgasoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Courses;
import com.durgasoft.entity.Student;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tc = null;

		try {

			cfg = new Configuration().configure("/com/durgosoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Student.class).addAnnotatedClass(Courses.class);

			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();

//===========================================inserting data into database==================================================			

			/*
			 * tc = session.beginTransaction();
			 * 
			 * Courses course1 = new Courses(111, "c", 1000); Courses course2 = new
			 * Courses(222, "c++", 3000); Courses course3 = new Courses(333, "java", 5000);
			 * 
			 * ArrayList<Courses> courseList = new ArrayList<Courses>(Arrays.asList(course1,
			 * course2, course3));
			 * 
			 * Student std1 = new Student(); std1.setSid(444); std1.setSname("DDD");
			 * std1.setCourses(courseList);
			 * 
			 * Student std2 = new Student(); std2.setSid(555); std2.setSname("CCC");
			 * std2.setCourses(courseList);
			 * 
			 * Student std3 = new Student(); std3.setSid(666); std3.setSname("BBB");
			 * std3.setCourses(courseList);
			 * 
			 * session.save(std1); session.save(std2); session.save(std3);
			 * 
			 * System.out.println("Students data inserted successfully!");
			 * 
			 * tc.commit();
			 */

//================================================retrieve the data======================================================

			Student student1 = session.get(Student.class, 444);
			List<Courses> courseList =  student1.getCourses();
			System.out.println("Student Details:-");
			System.out.println("----------------------");
			System.out.println("Student No    :-" + student1.getSid());
			System.out.println("Student Name  :-" + student1.getSname());
			courseList.stream().forEach(s -> System.out.println(s));
//			System.out.println("Course Id     :-" + branch.getBranchId());
//			System.out.println("Course Name   :-" + branch.getBranchName());
//			System.out.println("Course Cost   :-" + branch.getBranchName());
			System.out.println("------------------------------------------------------------------------");
			Student student2 = session.get(Student.class, 555);

			System.out.println("Student Details:-");
			System.out.println("----------------------");
			System.out.println("Student No    :-" + student2.getSid());
			System.out.println("Student Name  :-" + student2.getSname());
			courseList.stream().forEach(s -> System.out.println(s));
			System.out.println("------------------------------------------------------------------------");
			Student student3 = session.get(Student.class, 666);
			System.out.println("Student Details:-");
			System.out.println("----------------------");
			System.out.println("Student No    :-" + student3.getSid());
			System.out.println("Student Name  :-" + student3.getSname());
			courseList.stream().forEach(s -> System.out.println(s));

		} catch (Exception e) {
			System.out.println("Students data not inserted!");
//			tc.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
