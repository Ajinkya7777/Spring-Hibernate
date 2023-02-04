package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Predicate05 {

	public static void main(String[] args) {

		ArrayList<SoftwareGuy> emp = new ArrayList<SoftwareGuy>(
				Arrays.asList(new SoftwareGuy("Ajinkya", "Dev", "Latur", 23000.0d),
						new SoftwareGuy("Akshay", "Dev", "Latur", 20000.0d),
						new SoftwareGuy("John", "Manager", "Bangalore", 43000.0d)

				)

		);

		Predicate<SoftwareGuy> p1 = s -> s.getSalary() > 20000d;

		System.out.println("\nEmployess which are having salry greater than 23K :");
		m2(p1, emp);
		Predicate<SoftwareGuy> p2 = s -> s.getDesg().equalsIgnoreCase("Dev");
		System.out.println("\nThe Java Developers are :");
		m2(p2, emp);
		
		System.out.println(" \nThe employees having salary less than 23K :" );   //negate opposite of or Not of 
		m2(p1.negate(),emp);
		
		System.out.println("\n The employees having salary 23k and developers are :");// and of 
		m2(p2.and(p1), emp);
		
		System.out.println("\n The employees having salary 23k or devlopers are"); //or of
		m2(p2.or(p1), emp);

	}

	public static void m2(Predicate<SoftwareGuy> p, ArrayList<SoftwareGuy> emp) {
		for (SoftwareGuy s : emp) {
			if (p.test(s)) {
				System.out.println(s.getName());
			}
		}

	}
}
