package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class Test {

	public static void main(String[] args) {
//==============================================INSERT/CREATE/INTO DATABASE==============================================================
		/*
		 * SessionFactory session = new
		 * Configuration().configure().addAnnotatedClass(Employee.class)
		 * .buildSessionFactory();
		 * 
		 * Session sc = session.openSession();
		 * 
		 * org.hibernate.Transaction tc = sc.beginTransaction(); Employee e1 = new
		 * Employee(5, "Priti", 5000, "Jaipur");
		 * 
		 * int eno = (Integer) sc.save(e1);
		 * 
		 * tc.commit();
		 * 
		 * if (e1.geteNo() == eno) { System.out.println("Data Inserted Successfully!");
		 * } else { System.out.println(" Data Not saved!"); }
		 * 
		 * sc.clear(); session.close();
		 */

//==================================================READ/SELECT/RETRIEVE===============================================================		

// ###################################################################GET METHOD#########################################################

		// eager/early loading -> hits db immidiately after getting the Primary key

		SessionFactory session = new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session sc = session.openSession();

		//org.hibernate.Transaction tc = sc.beginTransaction();

		Employee e1 = sc.get(Employee.class, 5); 
		
		
		if (e1 == null) {
			System.out.println("Record does not exist!");
		} else {

			System.out.println("Employee NO :" + e1.geteNo());
			System.out.println("Employee Name :" + e1.geteName());
			System.out.println("Employee Salary :" + e1.getSalary());
			 System.out.println("Employee Addrs:" + e1.geteAddr()); }
		 

		//tc.commit();

		sc.close();
		session.close();

//###################################################################LOAD METHOD#########################################################		

		// load () --> lazy loading -> gives proxy object for provided primary key ->
		// hits DB when we try to access other Non-pk properties(name,sal,addr)

		/*
		 * SessionFactory session = new
		 * Configuration().configure().addAnnotatedClass(Employee.class)
		 * .buildSessionFactory();
		 * 
		 * Session sc = session.openSession();
		 * 
		 * org.hibernate.Transaction tc = sc.beginTransaction();
		 * 
		 * // Employee e1 = (Employee)sc.load(Employee.class, 1);
		 * 
		 * System.out.println("Before calling Load Method"); Employee e1 =
		 * sc.load(Employee.class, 1); System.out.println("After calling Load Method");
		 * 
		 * System.out.println("Employee NO :" + e1.geteNo());
		 * System.out.println("Employee Name :" + e1.geteName());
		 * System.out.println("Employee Salary :" + e1.getSalary());
		 * System.out.println("Employee Addrs:" + e1.geteAddr());
		 * 
		 * tc.commit();
		 * 
		 * sc.close(); session.close();
		 */
//====================================================UPDATE/SAVEORUPDATE===============================================================
		/*
		 * // we are declaring all of these variables bcz they're inside main method and
		 * // they will be treated as local variables and // it is mandatory to
		 * initialize the local variables.
		 * 
		 * Configuration cfg = null; SessionFactory sf = null; Transaction tcx = null;
		 * Session session = null;
		 * 
		 * try { // create the configuration object
		 * 
		 * cfg = new Configuration(); // get the configure or load the configure details
		 * cfg.configure(); // if the name of our HBN cfg file is "hibernate.cfg.xml"
		 * then we don't need to // pass the argument to the configure method
		 * 
		 * // call the AddAnnotations () method cfg.addAnnotatedClass(Employee.class);
		 * 
		 * // create the object for the SessionFactory sf = cfg.buildSessionFactory();
		 * 
		 * // get current session or open new session session = sf.openSession();
		 * 
		 * // begin the transaction tcx = session.beginTransaction();
		 * 
		 * // setting the updated values Employee e = new Employee(); e.seteNo(10);
		 * e.seteName("Ajinkya"); e.setSalary(10000); e.seteAddr("Latur");
		 * 
		 * // updating the value of primary key 1 using
		 * "Update,saveOrUpdate,merge methods"
		 * 
		 * // 1.update session.update(e);
		 * 
		 * // 2.saveOrUpdate // session.saveOrUpdate(e);
		 * 
		 * // 3.merge // session.merge(e);
		 * 
		 * // doing commit to save/update the changes in database. tcx.commit();
		 * 
		 * System.out.println("Record updated successfully!");
		 * 
		 * } catch (
		 * 
		 * Exception e) { // if in case record is not updated successfully then rollback
		 * will execute
		 * 
		 * tcx.rollback(); System.out.println("Record not Updated!");
		 * e.printStackTrace(); } finally { // close the sessionFactory and Session
		 * session.close(); sf.close(); }
		 */

//====================================================DELETE==========================================================================

//		Configuration cfg = null;
//		SessionFactory sf = null;
//		Transaction tcx = null;
//		Session session = null;
//
//		try {
//			cfg = new Configuration();
//
//			cfg.configure();
//			
//			cfg.addAnnotatedClass(Employee.class);
//
//			sf = cfg.buildSessionFactory();
//
//			session = sf.openSession();
//
//			tcx = session.beginTransaction();
//
//			Employee e = new Employee(); // employee primary key to be deleted
//			e.seteNo(6);
//
//			// deleting the employee
//			System.out.println("Deleting the Employee "+e.geteNo());
//			session.delete(e);
//
//			tcx.commit();
//
//			System.out.println("Record deleted successfully!");
//
//		} catch (Exception e) {
//			tcx.rollback();
//			System.out.println("Record not deleted!");
//			e.printStackTrace();
//		} finally {
//			session.close();
//			sf.close();
//		}

	}
}
