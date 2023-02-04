package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function03 {

	public static void main(String[] args) {
		
		Predicate<Student> p = s-> s.getMarks()>=60;
		
		
		Function<Student, String> f = s -> {
			if ((s.getMarks() >= 60)) {
				return s.getName() + " got A grade";
			} else if ((s.getMarks() >= 50)) {
				return s.getName() + " got B grade";
			} else if ((s.getMarks() >= 40)) {
				return s.getName() + " got C grade";
			} else if ((s.getMarks() >= 35)) {
				return s.getName() + " got D grade";
			} else {
				return s.getName() + " got E grade , Failed!";
			}

		};

		ArrayList<Student> list = new ArrayList<Student>();
		populate(list);
		System.out.println(list.toString());
		
		for (Student student : list) {
			if (p.test(student)) {
				
				System.out.println("all the students which are having greater than 60 marks are :\n"+f.apply(student)+" with marks "+student.getMarks());
			}
		}

	}

	public static void populate(ArrayList<Student> list) {

		list.add(new Student("Ajinkya", 55));
		list.add(new Student("Shubham", 49));
		list.add(new Student("Sam", 35));
		list.add(new Student("John", 25));
		list.add(new Student("Rick", 65));

	}
}