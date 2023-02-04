package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiFunction02 {
	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();

		BiConsumer<Employees, Double> b = (e, d) -> System.out.println("Increament Salrty :" + (e.getSalary() + d));

		populate(list);

		for (Employees employees : list) {
			b.accept(employees, 1000d);
		}
	}

	public static void populate(ArrayList<Employees> list) {
		list.add(new Employees("A", 10000));
		list.add(new Employees("B", 18000));
		list.add(new Employees("C", 15000));
		list.add(new Employees("D", 20000));

	}
}
