package LambdaExpressionAndFunctionalInterface;

import java.util.function.BiFunction;

public class BiFunction01 {
	public static void main(String[] args) {

		Employee01 e1 = new Employee01(1, "Ajinkya", 1500.0);
		TimeSheet t1 = new TimeSheet(1, 25);

		BiFunction<Employee01, TimeSheet, Double> b = (e, t) ->

		(e.getDilayWage() * t.getDays());
		// { double totalSalary =0;
		// totalSalary =e.getDilayWage()*t.getDays();
		// return totalSalary;
//		};

		System.out.println(b.apply(e1, t1));

	}

}
