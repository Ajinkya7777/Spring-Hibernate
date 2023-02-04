package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunction00 {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		BiFunction<String, Integer, Student> b = (s, i) -> new Student(s, i);

		list.add(b.apply("Ajinkya", 70));
		list.add(b.apply("Sam", 55));
		list.add(b.apply("Rick", 43));
		list.add(b.apply("John", 50));

		// System.out.println(list.toString());
		System.out.println("The following " + list.size() + " students are added successfully.");

		for (Student s : list) {
			System.out.println(s);
		}

	}
}
