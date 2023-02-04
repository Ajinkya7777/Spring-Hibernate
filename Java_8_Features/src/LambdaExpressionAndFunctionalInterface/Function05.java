package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import LambdaExpressionAndFunctionalInterface.Employees;

//program to count the total monthly salary of all employees by using function 
public class Function05 {

	public static void main(String[] args) {

		ArrayList<Employees> list = new ArrayList<Employees>();
		Function<ArrayList<Employees>, Double> f = e -> {
			double totalSalary = 0;
			for (Employees emp : list) {
				totalSalary = emp.getSalary() + totalSalary;
			}
			return totalSalary;
		};

		populate(list);
		System.out.println(list);

		System.out.println("Total Salary = " + f.apply(list));
	}

	private static void populate(ArrayList<Employees> list) {

		list.add(new Employees("Sam", 1000));
		list.add(new Employees("Ram", 2000));
		list.add(new Employees("Aj", 2000));
		list.add(new Employees("Cat", 2000));
	}
}
