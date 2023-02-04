package LambdaExpressionAndFunctionalInterface;

//this is the example of BiPredicate which takes two parameters as input and it's return type is boolean only
// the only difference between Bipredicate and predicate is former takes two parameter as the later takes the only single parameter
//rest all methods are same in both Bipredicate and predicate functional interface.
import java.util.function.BiPredicate;

public class BiPredecate00 {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> b = (a, c) -> (a * c > 10);

		System.out.println(b.test(2, 13));
	}
}
