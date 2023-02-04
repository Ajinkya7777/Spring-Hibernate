package ComparableVSComparator;

import java.util.ArrayList;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Ajinkya", 1);
		Employee emp2 = new Employee("Swati",2);
		Employee emp3 = new Employee("Ronaldo",3);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList);
	}
}
