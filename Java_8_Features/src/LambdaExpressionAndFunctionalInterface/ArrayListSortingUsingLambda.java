package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortingUsingLambda {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 4, 3, 5, 2));

		System.out.println(list);
		// [0,1,4,35,2]  //arraylist maintains the insertion order so will get this o/p

		Collections.sort(list); // gives natural order if we pass only list and if we pass comparator
		// [0,1,2,3,4,5] // implementing object then gives customized order

		System.out.println(list);

		Collections.sort(list, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0); // passing the
		// [5,4,3,2,1,0] // collections.sort(list,comarator
		// implementing object i.e lambda
		// expression)

		System.out.println(list);
	}

}
