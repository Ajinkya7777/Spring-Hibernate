package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Branch;
import com.durgasoft.entity.Student;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
//		Transaction tc = null;

		try {

			cfg = new Configuration().configure("/com/durgosoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Student.class).addAnnotatedClass(Branch.class);

			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();

//===========================================inserting data into database==================================================			

			/*
			 * tc = session.beginTransaction();
			 * 
			 * Branch branch = new Branch(); branch.setBranchId(777);
			 * branch.setBranchName("IT");
			 * 
			 * Student std1 = new Student(); std1.setSid(111); std1.setSname("AAA");
			 * std1.setBranch(branch);
			 * 
			 * Student std2 = new Student(); std2.setSid(222); std2.setSname("AAA");
			 * std2.setBranch(branch);
			 * 
			 * Student std3 = new Student(); std3.setSid(333); std3.setSname("AAA");
			 * std3.setBranch(branch);
			 * 
			 * session.save(std1); session.save(std2); session.save(std3);
			 * 
			 * System.out.println("Students data inserted successfully!");
			 * 
			 * tc.commit();
			 */
//================================================retrieve the data======================================================

			Student student1 = session.get(Student.class, 111);
			Branch branch = student1.getBranch();
			System.out.println("Student Details:-");
			System.out.println("----------------------");
			System.out.println("Student No    :-" + student1.getSid());
			System.out.println("Student Name  :-" + student1.getSname());
			System.out.println("Branch Id     :-" + branch.getBranchId());
			System.out.println("Branch Name   :-" + branch.getBranchName());
			System.out.println("------------------------------------------------------------------------");
			Student student2 = session.get(Student.class, 222);
			Branch branch2 = student2.getBranch();
			System.out.println("Student Details:-");
			System.out.println("----------------------");
			System.out.println("Student No    :-" + student2.getSid());
			System.out.println("Student Name  :-" + student2.getSname());
			System.out.println("Branch Id     :-" + branch2.getBranchId());
			System.out.println("Branch Name   :-" + branch2.getBranchName());
			System.out.println("------------------------------------------------------------------------");
			Student student3 = session.get(Student.class, 333);
			Branch branch3 = student3.getBranch();
			System.out.println("Student Details:-");
			System.out.println("----------------------");
			System.out.println("Student No    :-" + student3.getSid());
			System.out.println("Student Name  :-" + student3.getSname());
			System.out.println("Branch Id     :-" + branch3.getBranchId());
			System.out.println("Branch Name   :-" + branch3.getBranchName());

		} catch (Exception e) {
			System.out.println("Students data not inserted!");
//			tc.rollback();
			e.printStackTrace();
		} finally {

		}

	}
}
