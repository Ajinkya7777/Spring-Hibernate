package LambdaExpressionAndFunctionalInterface;

import java.util.function.Supplier;

public class Supplier02 {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp = "";

			for (int i = 0; i < 6; i++) {

				int randomNo = (int) (Math.random() * 10);
				otp = otp + randomNo;
			}

			return otp;

		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
