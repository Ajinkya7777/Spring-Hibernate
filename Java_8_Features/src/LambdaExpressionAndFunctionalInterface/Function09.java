package LambdaExpressionAndFunctionalInterface;

import java.util.Scanner;
import java.util.function.Function;
public class Function09 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" Enter the user name : ");
		String userName = scan.nextLine();

		System.out.println(" Enter the Password :");
		String pwd = scan.nextLine();

		//ArrayList<User> list = new ArrayList<User>(Arrays.asList(new User(userName, pwd)));

		Function<String, String> f1 = s -> s.substring(0, 5);
		Function<String, String> f2 = s -> s.toLowerCase();

		if (f1.andThen(f2).apply(userName).equalsIgnoreCase("Durga") && pwd.equals("java")) {
			System.out.println("Successfully logged in!");
		} else {
			System.out.println("Invalid User!");
		}
	}
}
