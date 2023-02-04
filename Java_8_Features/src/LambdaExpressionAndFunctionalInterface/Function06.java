package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import LambdaExpressionAndFunctionalInterface.Employees;

//program to count the total monthly salary of all employees by using function 
public class Function06 {

	public static void main(String[] args) {

		ArrayList<Employees> list = new ArrayList<Employees>();
		ArrayList<Employees> list2 = new ArrayList<Employees>();

		Predicate<Employees> p = e -> e.getSalary() <= 2000;
		Function<Employees, Employees> f = e -> {
			double increament = 440;

			increament = e.getSalary() + increament;
			e.setSalary(increament);

			return e;
		};

		populate(list);
		System.out.println("Before Increament" + list);

		for (Employees employees : list) {
			if (p.test(employees)) {
				// System.out.println(employees.getName()+" : "+employees.getSalary());
				f.apply(employees);
				// list2.add(f.apply(employees));
				list2.add(employees);
				// System.out.println("Updated salary of "+employees.getName()+" "+
				// f.apply(employees));
			}
		}
		System.out.println("\nAfter Increament" + list2);
	}

	private static void populate(ArrayList<Employees> list) {

		list.add(new Employees("Sam", 1000));
		list.add(new Employees("Ram", 2000));
		list.add(new Employees("Aj", 7000));
		list.add(new Employees("Cat", 8000));
	}
}
