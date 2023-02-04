package LambdaExpressionAndFunctionalInterface;

import java.util.function.Function;

public class Function02 {
	
	public static void main(String[] args) {
		
		String myString = " My team is Real Madrid ";
		
		Function<String, Integer> f= s->s.length()-s.replaceAll(" ", "").length();
		
		System.out.println("Length :"+f.apply(myString));
		
	}
}
