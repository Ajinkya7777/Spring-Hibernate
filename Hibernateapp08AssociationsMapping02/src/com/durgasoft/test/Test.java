package com.durgasoft.test;

//import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgasoft.entity.Department;
import com.durgasoft.entity.Employee;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		// Transaction tc = null;

		try {

			cfg = new Configuration().configure("/com/durgosoft/resources/hibernate.cfg.xml");
			cfg.addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);

			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			
//===========================================inserting data into database==================================================			
			
			/*
			 * tc = session.beginTransaction();
			 * 
			 * Employee emp1 = new Employee(); emp1.setEid(111); emp1.setEname("AAA");
			 * emp1.setSalary(5000);
			 * 
			 * Employee emp2 = new Employee(); emp2.setEid(222); emp2.setEname("BBB");
			 * emp2.setSalary(6000);
			 * 
			 * Employee emp3 = new Employee(); emp3.setEid(333); emp3.setEname("CCC");
			 * emp3.setSalary(7000);
			 * 
			 * Department dept = new Department(); dept.setDeptName("Cash");
			 * dept.setDeptNo(777); dept.setEmps(Arrays.asList(emp1, emp2, emp3));
			 * 
			 * session.save(dept); System.out.println("Employee inserted successfully!");
			 * tc.commit();
			 */

//================================================retrieve the data======================================================
			Department dept = session.get(Department.class, 777);
			System.out.println("Department Details:-");
			System.out.println("----------------------");
			System.out.println("Department No    :-" + dept.getDeptNo());
			System.out.println("Department Name  :-" + dept.getDeptName());

			List<Employee> emps = dept.getEmps();
			System.out.println("\nEmployee Details:-");
			System.out.println("----------------------");
			emps.stream().forEach(s -> System.out.println(s));

		} catch (Exception e) {
			System.out.println("Employee could not be inserted!");
//			tc.rollback();
			e.printStackTrace();
		} finally {

		}

	}
}
