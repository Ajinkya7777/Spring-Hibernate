package LambdaExpressionAndFunctionalInterface;

//program to check weather the given string length is greater than 5 or not

import java.util.function.Predicate;

public class Predicate01 {
	 public static void main(String[] args) {
		
		 Predicate<String> p = s->  (s.length())<5;
		 
		 System.out.println(p.test("Ajinkya"));  //false
		 
		 System.out.println(p.test("Java")); //true
		 
	}
}
