package employeeCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class UpdatingEmployee {

	public static void main(String[] args) {

		// create session factory

		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				//.buildSessionFactory();
		
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
			
		

		// create session

		Session session = factory.getCurrentSession();

		try {
			int EmployeeID = 1;
			// start the transaction
			session.beginTransaction();

			// find out the Employee's based on the ID : Primary key
			System.out.println("\nGetting Employee with ID: " + EmployeeID);

			Employee myEmployee = session.get(Employee.class, EmployeeID);

			System.out.println("Updating Employee....");

			myEmployee.setFirstName("Shinde");

			// commit the transaction
			session.getTransaction().commit();

			// New Code
			// start the transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// update the company for all Employees
			System.out.println("\n\nUpdate company for all Employees ");

			session.createQuery("update Employee set company='Real Madrid'").executeUpdate();

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			factory.close();
			e.printStackTrace();
		}
	}
}
