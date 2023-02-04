package LambdaExpressionAndFunctionalInterface;

import java.util.function.Function;
 

/*
 * public class Function00 implements Function<String, Integer> { public static
 * void main(String[] args) {
 * 
 * Function00 f = new Function00(); System.out.println(f.apply("Sam"));
 * 
 * }
 * 
 * public Integer apply(String s) { int i = s.length(); return i; } }
 */

public class Function00  {
	 public static void main(String[] args) {
		
		Function<String, Integer> f = s->s.length();
		
		   System.out.println(f.apply("ajinkya"));
		   
		 
	}
	 
	 
}
