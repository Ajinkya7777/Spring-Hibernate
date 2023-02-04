package LambdaExpressionAndFunctionalInterface;

import java.util.function.Function;

public class Function08 {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i + i;
		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println("\nfunction Chainging using andThen(): " + f1.andThen(f2).apply(2)); //f1 before f2 will execute
		System.out.println("\nfunction Chainging using compose(): " + f1.compose(f2).apply(2)); //f2 before f1 will execute
	}
}
