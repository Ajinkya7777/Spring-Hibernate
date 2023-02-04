package LambdaExpressionAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Test implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {

//		if (i1 > i2) {
//
//			return -1;
//		} else if (i1 < i2) {
//			return 1;
//		} else {
//			return 0;
//		}
		 return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;   //use of ternary operator instead of if else if ()
	}

}

class ArrayListComparator {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 4, 3, 2, 5));

		// list = (Arrays.asList(0,1,4,3,2,5));

		System.out.println("\nafter initlizing :" + list);

		//Test t = new Test();

//		System.out.println("Before sorting : "+(Collections.sort(list)));
		// t.compare(list.get(0), list.get(1));
		Collections.sort(list);

		System.out.println("\nbefore sorting :" + list);

		Collections.sort(list, new Test());
		System.out.println(" \nafter sorting :" + list);

	}
}
