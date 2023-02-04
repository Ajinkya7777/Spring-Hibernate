package LambdaExpressionAndFunctionalInterface;

import java.util.function.Function;

//program to remove spaces from given string by using the Function 
public class Function01 {
	
	public static void main(String[] args) {
		
		Function<String, String> f = s->s.replaceAll(" ", "");
		
		System.out.println(f.apply("My Team is Real Madrid"));
	}
}
