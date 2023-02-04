package employeeCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class ReadEmployee {

	public static void main(String[] args) {

		// create session factory

//		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
//				.buildSessionFactory();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory factory = cfg.buildSessionFactory();

		// create session

		System.out.println("get current session\n\n");
		Session session = factory.getCurrentSession();

		try {
			// use the session object to save the java object

			// create a Employee object
			System.out.println("Creating the Employee object");
			Employee tempEmployee = new Employee("DAffy", "Duck", "dd@luv2code.com");

			// start the transaction
			session.beginTransaction();

			// save the Employee object
			System.out.println("Saving the Employee object....");
			System.out.println(tempEmployee);
			session.save(tempEmployee);

			// commit the transaction
			session.getTransaction().commit();

			// my new Code

			// find out the Employee's id: primary key
			System.out.println("Saved Employee.Gererated id:" + tempEmployee.getId());

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve Employee based on the id: primary key
			System.out.println("Getting Employee with id:" + tempEmployee.getId());

			Employee myEmployee = session.get(Employee.class, tempEmployee.getId());

			System.out.println("\n get complete :" + myEmployee);
			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			factory.close();
			e.printStackTrace();
		}
	}
}
