package LambdaExpressionAndFunctionalInterface;

import java.util.function.Supplier;

public class Supplier01 {
	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String[] str = { "java", "python", "Kotlin", "Kubernetes", "Docker" };

			int randomString = (int) (Math.random() * 5);
			return str[randomString];
		};

		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}
}
