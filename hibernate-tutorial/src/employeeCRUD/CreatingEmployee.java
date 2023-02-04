package employeeCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class CreatingEmployee {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfgEmployee.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			// create a Employee object
			System.out.println("Creating the Employee object");
			Employee tempEmployee1 = new Employee("Swati", "Shinde", "Astregic");
			Employee tempEmployee2 = new Employee("Ronalod", "CR7", "Real Madrid");
			Employee tempEmployee3 = new Employee("Kylian", "Mbappe", "PSG");

			// start the transaction
			session.beginTransaction();

			// save the Employee object
			System.out.println("Saving the Employee object....");

			session.save(tempEmployee1);
			session.save(tempEmployee2);
			session.save(tempEmployee3);

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception e) {
			factory.close();
		}
	}
}
