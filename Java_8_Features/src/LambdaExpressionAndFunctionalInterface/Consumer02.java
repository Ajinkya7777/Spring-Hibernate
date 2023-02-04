package LambdaExpressionAndFunctionalInterface;

//in this example we used all Predicate , Function, and consumer 
//  1)Predicate ==== to check the condition and to return boolean values based on the condition 
//  2)Function  ==== to perform opertions and return the values based on the operations and input parameters;
//  3)Consumer  ====  to print the provided data , it does not return anything it's return type is void ;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		populate(list);

		Predicate<Student> p = s -> s.getMarks() > 60;

		Function<Student, String> f = s -> {
			if (s.getMarks() >= 70) {
				return "A grade";
			} else if (s.getMarks() >= 60) {
				return "B grade";
			} else if (s.getMarks() >= 50) {
				return "C grade";
			} else if (s.getMarks() >= 40) {
				return "D grade";
			} else if (s.getMarks() >= 35) {
				return "E grade";
			} else {
				return "F grade Failed!";
			}

		};

		Consumer<Student> c = s -> {
			System.out.println(" Student Name :" + s.getName());
			System.out.println(" Student Marks :" + s.getMarks());
			System.out.println(" Student Grade :" + f.apply(s)); //Function is used to get the grades 
			System.out.println();

		};
		
		for (Student student : list) {
			//c.accept(student);
			if (p.test(student)) {   //Predicate interface used to check weather student having greater than 60 marks or not
				c.accept(student);  //Consumer interface used to print the student data 
			}
		}
	}

	public static void populate(ArrayList<Student> list) {
		list.add(new Student("Brad", 80));
		list.add(new Student("John", 30));
		list.add(new Student("Andrew", 44));
		list.add(new Student("Ashley", 78));
		list.add(new Student("Stanley", 60));
		list.add(new Student("James", 50));
	}
}
