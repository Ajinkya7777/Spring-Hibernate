package LambdaExpressionAndFunctionalInterface;

import java.util.function.Supplier;

public class Supplier00 {
	 public static void main(String[] args) {
		
		 Supplier<String> s = ()->"String";
		 
		 System.out.println(s.get()); 
	}
}
