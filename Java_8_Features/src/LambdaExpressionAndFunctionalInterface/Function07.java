package LambdaExpressionAndFunctionalInterface;

import java.util.function.Function;

//Function Chaining Demo Example
public class Function07 {
	
	public static void main(String[] args) {
		
		Function<String, String> f1 = s-> s.toLowerCase();
		Function<String, String> f2 = s-> s.substring(0, 4);
		//Function<String, Character> f3 = s-> s.charAt(0);
		
		
		System.out.println("Lower Case : "+f1.apply("java"));
		System.out.println("Substring Case: "+f2.apply("javaExample"));
		//ystem.out.println("CharAt case: "+f3.apply("java"));
		
		//f1 before f2 will execute
		System.out.println("\nfunction Chainging using andThen(): "+f1.andThen(f2).apply("java"));
		
		//f2 before f1 will execute
		System.out.println("\nfunction Chainging using compose(): "+f1.compose(f2).apply("javaExample")); 
		
	}
}
