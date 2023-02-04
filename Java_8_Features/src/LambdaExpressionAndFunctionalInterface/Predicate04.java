package LambdaExpressionAndFunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate04 {
	private static String password;
	private static String userName;
	private static boolean login = true;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {


		Predicate<User> p = u -> u.getName().equalsIgnoreCase("Ajinkya") && u.getPwd().equalsIgnoreCase("Java");

		
		

		while (login) {
			System.out.println("Type the Username:");
			userName = scan.nextLine();
			
			System.out.println(" Type Passoword :");
			password = scan.nextLine();
			
			User u = new User(userName, password);

			if (p.test(u)) {
				System.out.println("Successfully Logged in");
				// login = false;
				break;
			} else {
				System.out.println("try again");

			}

		}
	}

}
