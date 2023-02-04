package LambdaExpressionAndFunctionalInterface;

import java.util.Comparator;
import java.util.TreeSet;

class Test1 implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
	}

}

class TreeSetComparator {

	public static void main(String[] args) {

		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(0);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(5);
		tree.add(3);
		
 System.out.println("after initlizing:"+tree);  //gives natural sorting order as it is sorting data structure follws binary search tree algo
 											  // we are not using any comparator bcz treeset with 0 parameters gives natural sorting set
 												// but if we pass the comparator obj then we will get customsized order
 
 System.out.println("tree using TreeSet() for Natural order :"+tree);
 		TreeSet<Integer> tree2 = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
 		tree2.add(0);
		tree2.add(1);
		tree2.add(2);
		tree2.add(4);
		tree2.add(5);;
		tree2.add(3);
 		
 			System.out.println("tree2 using lambda expression for customised order :"+tree2);
 
	}
}
