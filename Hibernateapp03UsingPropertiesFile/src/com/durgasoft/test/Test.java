package com.durgasoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sf = null;
		// Transaction tcx = null;
		Session session = null;

		try {
			cfg = new Configuration();

			// cfg.configure();

			cfg.addAnnotatedClass(Employee.class);

			sf = cfg.buildSessionFactory();

			session = sf.openSession();

			Employee emp = session.get(Employee.class, 1);

			if (emp == null) {
				System.out.println("Employee does not existed");
			} else {
				System.out.println("Employee Details:");
				System.out.println("--------------------------------");
				System.out.println("Employee Name: " + emp.geteName());
				System.out.println("Employee Id: " + emp.geteNo());
				System.out.println("Employee Salary: " + emp.getSalary());
				System.out.println("Employee Address: " + emp.geteAddr());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}

	}
}
