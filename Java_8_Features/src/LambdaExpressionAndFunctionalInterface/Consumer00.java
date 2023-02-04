package LambdaExpressionAndFunctionalInterface;

import java.util.function.Consumer;

public class Consumer00 {
	
	public static void main(String[] args) {
		
		Consumer<String> c = s-> System.out.println(s);
		
		c.accept("Hello World");
	}
}
