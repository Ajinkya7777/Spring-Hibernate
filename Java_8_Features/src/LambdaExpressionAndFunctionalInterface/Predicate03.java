
package LambdaExpressionAndFunctionalInterface;

//program to get the null and empty strings and then add them to arraylist which starts which doesn't contain null or empty strings
//using predicate functional interface

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate03 {

	public static void main(String[] args) {

		String[] lang = { "Java",null,"Kotlin"," ","Kubernetes"," " };

		ArrayList<String> al = new ArrayList<String>();

		
		Predicate<String> p = s -> s!=null&&s.length()!=0;

		for (String s : lang) {
			if (p.test(s)) {

				al.add(s);
			}
		}

		System.out.println("ArrayList does not Containing null and empty strings:" + al.toString());
	}
}
