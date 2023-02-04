package LambdaExpressionAndFunctionalInterface;

import java.util.function.Predicate;

//there are 2 ways to use preidcate interface / function .  either by using normal like we did in this example 
// or we can use predicate type to hold the reference of lambda expression we will work mostly with Lambda expression .

// 1) BY USING IMPLEMENT METHOD 

public class Predicate00 implements Predicate<Integer> {

	public boolean test(Integer i) {
		return i > 20;
	}

	public static void main(String[] args) {

		Predicate00 p = new Predicate00();

		System.out.println(p.test(21));
	}
}

//2) BY USING LAMBDA EXPRESSION HERE 

//" Predicate<Integer> p = i-> (i>20) ; " is lambda expression that is it is test method in functional
// interface and p will hold reference of lambda expression and then that p
// itself p will be used to call the
// lambda expression . like p.test(20);
// here i is integer value input it will take in lambda expression .

/*
 * public class Predicate00 {
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * Predicate<Integer> p = i -> (i>20); //Predicate00 pr = new Predicate00();
 * 
 * System.out.println(p.test(2)); } }
 */
