package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer01 {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		populate(list);

		Consumer<Movie> c = m -> {
			System.out.println("Movie Name: " + m.getName());
			System.out.println("Movie Actor: " + m.getActor());
			System.out.println("Movie Actress: " + m.getActress());
			System.out.println();
		};

		for(Movie movie:list) {
			c.accept(movie);
		}
	}

	public static void populate(ArrayList<Movie> list) {

		list.add(new Movie("Who Am I?", "John", "Cerena"));
		list.add(new Movie("Fight Club", "Brad pitt", "Emily"));
		list.add(new Movie("Amazing SpiderMan", "Andrew", "Emma"));
		list.add(new Movie("Hacker", "Jack", "Taylor"));
	}
}
