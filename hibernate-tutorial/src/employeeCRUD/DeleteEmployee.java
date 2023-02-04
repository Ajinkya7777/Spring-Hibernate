package employeeCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {
//			int EmployeeID = 1;
//			// start the transaction
			session.beginTransaction();
//
//			// find out the Employee's based on the ID : Primary key
//			System.out.println("\nGetting Employee with ID: " + EmployeeID);
//
//			Employee myEmployee = session.get(Employee.class, EmployeeID);
//
//			// delete the Employee
//			System.out.println("\n\nDeleting the Employee:" + myEmployee.getId());
//			session.delete(myEmployee);

			// deleting the Employee id with 2
			System.out.println("\n\nDeleting the Employee with ID =2");
			session.createQuery("delete from Employee where firstName='Duck'").executeUpdate();
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
