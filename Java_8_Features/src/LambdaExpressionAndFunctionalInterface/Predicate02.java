package LambdaExpressionAndFunctionalInterface;

//program to get the String which starts with "k" using predicate functional interface

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate02 {

	public static void main(String[] args) {

		String[] lang = new String[] { "Java", "C++", "Kotlin", "python" , "Kubernetes"};

		ArrayList<String> al = new ArrayList<String>();

		Predicate<String> p = s -> s.charAt(0) == 'K';

		for (String s : lang) {
			if (p.test(s)) {

				al.add(s);
			}
		}
		
		System.out.println("The Arraylist contating languages starts with K :"+ al.toString());
	}
}
