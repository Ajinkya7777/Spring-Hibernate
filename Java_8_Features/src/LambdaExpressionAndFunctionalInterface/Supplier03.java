package LambdaExpressionAndFunctionalInterface;

import java.util.function.Supplier;

public class Supplier03 {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String pwd = "";

			Supplier<Integer> d = () -> ((int) (Math.random() * 10));

			String specialSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

			Supplier<Character> chars = () -> specialSymbols.charAt((int) (Math.random() * 29));
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + d.get();
				} else {
					pwd = pwd + chars.get();
				}
			}
			return pwd;

		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
