package LambdaExpressionAndFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumer00 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Coding";

		BiConsumer<String, String> b = (s, ss) -> System.out.println(s.concat(ss));

		b.accept(s1, s2);
	}
}
